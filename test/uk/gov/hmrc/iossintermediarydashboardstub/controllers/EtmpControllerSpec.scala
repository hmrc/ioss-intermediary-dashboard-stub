/*
 * Copyright 2025 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.iossintermediarydashboardstub.controllers

import org.scalatest.matchers.should.Matchers.shouldBe
import play.api.http.Status.BAD_REQUEST
import play.api.http.{MimeTypes, Status}
import play.api.libs.json.Json
import play.api.mvc.Headers
import play.api.test.Helpers.{ACCEPT, AUTHORIZATION, CONTENT_TYPE, DATE, GET, contentAsJson, defaultAwaitTimeout, status}
import play.api.test.{FakeRequest, Helpers}
import uk.gov.hmrc.iossintermediarydashboardstub.base.SpecBase
import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.{EtmpObligation, EtmpObligationDetails, EtmpObligations, EtmpObligationsFulfilmentStatus, ObligationsDateRange}
import uk.gov.hmrc.iossintermediarydashboardstub.utils.Formatters.dateTimeFormatter
import uk.gov.hmrc.iossintermediarydashboardstub.utils.JsonSchemaHelper

import java.time.{LocalDate, LocalDateTime}
import java.util.UUID

class EtmpControllerSpec extends SpecBase {

  private val jsonSchemaHelper: JsonSchemaHelper = new JsonSchemaHelper()
  private val controller: EtmpController = new EtmpController(Helpers.stubControllerComponents(), jsonSchemaHelper)

  private val validHeaders: Seq[(String, String)] = Seq(
    (AUTHORIZATION, ""),
    (ACCEPT, MimeTypes.JSON),
    ("X-Correlation-Id", UUID.randomUUID().toString),
    ("X-Forwarded-Host", ""),
    (CONTENT_TYPE, MimeTypes.JSON),
    (DATE, dateTimeFormatter.format(LocalDateTime.now())))

  private val validFakeHeaders: Headers = new Headers(validHeaders)

  "EtmpController" - {

    ".getObligations - GET /enterprise/obligation-data/{idType}/{idNumber}/{regimeType}" - {

      val idType: String = "IOSS"
      val regimeType: String = "IOSS"
      val obligationFulfilmentStatus: String = "O"
      val referenceNumber: String = "IN9001234567"
      val firstDateOfYear: LocalDate = LocalDate.of(2025, 1, 1)
      val lastDateOfYear: LocalDate = LocalDate.of(2025, 12, 31)
      val dateRange: ObligationsDateRange = ObligationsDateRange(firstDateOfYear, lastDateOfYear)

      val fakeRequest = FakeRequest(
        GET,
        routes.EtmpController.getObligations(
          idType = idType,
          idNumber = referenceNumber,
          regimeType = regimeType,
          dateRange = dateRange,
          status = Some(obligationFulfilmentStatus)
        ).url
      )

      "must return a BadRequest when headers are missing" in {

        val result = controller.getObligations(
          idType = idType,
          idNumber = referenceNumber,
          regimeType = regimeType,
          dateRange = dateRange,
          status = Some(obligationFulfilmentStatus)
        )(fakeRequest)

        status(result) shouldBe BAD_REQUEST
      }

      "must return a successful response" in {

        val successfulObligationsResponse = EtmpObligations(
          obligations = Seq(
            EtmpObligation(
              obligationDetails = Seq(
                EtmpObligationDetails(
                  status = EtmpObligationsFulfilmentStatus.Open,
                  periodKey = "25AL"
                ),
                EtmpObligationDetails(
                  status = EtmpObligationsFulfilmentStatus.Fulfilled,
                  periodKey = "25AK"
                ),
                EtmpObligationDetails(
                  status = EtmpObligationsFulfilmentStatus.Fulfilled,
                  periodKey = "25AJ"
                )
              )
            )
          )
        )

        val request = fakeRequest.withHeaders(validFakeHeaders)

        val result = controller.getObligations(
          idType = idType,
          idNumber = referenceNumber,
          regimeType = regimeType,
          dateRange = dateRange,
          status = Some(obligationFulfilmentStatus)
        )(request)

        status(result) shouldBe Status.OK
        contentAsJson(result) shouldBe Json.toJson(successfulObligationsResponse)
      }
    }
  }
}
