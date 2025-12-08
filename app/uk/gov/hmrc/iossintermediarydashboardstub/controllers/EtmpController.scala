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

import com.google.inject.Singleton
import play.api.Logging
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.EtmpObligationsFulfilmentStatus.{Fulfilled, Open}
import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.{EtmpObligations, ObligationsDateRange}
import uk.gov.hmrc.iossintermediarydashboardstub.utils.FutureSyntax.FutureOps
import uk.gov.hmrc.iossintermediarydashboardstub.utils.JsonSchemaHelper
import uk.gov.hmrc.iossintermediarydashboardstub.utils.ObligationsData.generateObligationsResponse
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController

import java.time.{Clock, LocalDate}
import javax.inject.Inject
import scala.concurrent.ExecutionContext

@Singleton
class EtmpController @Inject()(
                                cc: ControllerComponents,
                                jsonSchemaHelper: JsonSchemaHelper,
                                clock: Clock
                              ) extends BackendController(cc) with Logging {

  implicit val ec: ExecutionContext = cc.executionContext

  def getObligations(
                      idType: String,
                      idNumber: String,
                      regimeType: String,
                      dateRange: ObligationsDateRange,
                      status: Option[String]
                    ): Action[AnyContent] = Action.async {
    implicit request =>

      logger.info(s"getObligations with request: $request, headers: ${request.headers} and body: ${request.body}.")
      jsonSchemaHelper.applySchemaHeaderValidation(request.headers) {

        def generateObligations(idNumber: String, dateRange: ObligationsDateRange): EtmpObligations = {
          idNumber match {
            case "IN9001234567" =>
              generateObligationsResponse(
                data = Map(
                  "IM9001144771" -> Map(
                    LocalDate.now(clock).minusMonths(3) -> Fulfilled,
                    LocalDate.now(clock).minusMonths(2) -> Open,
                    LocalDate.now(clock).minusMonths(1) -> Open,
                    LocalDate.now(clock) -> Open
                  ),
                  "IM9001144772" -> Map(
                    LocalDate.now(clock).minusMonths(3) -> Fulfilled,
                    LocalDate.now(clock).minusMonths(2) -> Open
                  ),
                  "IM9001144773" -> Map(
                    LocalDate.now(clock).minusMonths(3) -> Fulfilled,
                    LocalDate.now(clock).minusMonths(2) -> Open
                  )
                ),
                dateRange = dateRange
              )

            case _ => generateObligationsResponse(
              data = Map(
                "IM9001234567" -> Map(
                  LocalDate.of(2025, 12, 1) -> Open,
                  LocalDate.of(2025, 11, 1) -> Fulfilled,
                  LocalDate.of(2025, 10, 1) -> Fulfilled
                ),
                "IM9001234568" -> Map(
                  LocalDate.of(2025, 12, 1) -> Open,
                  LocalDate.of(2025, 11, 1) -> Fulfilled,
                  LocalDate.of(2025, 10, 1) -> Fulfilled
                )
              ),
              dateRange
            )
          }
        }

        Ok(Json.toJson(generateObligations(idNumber, dateRange))).toFuture
      }
  }
}
