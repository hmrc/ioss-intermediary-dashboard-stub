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
import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.{EtmpObligations, ObligationsDateRange}
import uk.gov.hmrc.iossintermediarydashboardstub.utils.FutureSyntax.FutureOps
import uk.gov.hmrc.iossintermediarydashboardstub.utils.JsonSchemaHelper
import uk.gov.hmrc.iossintermediarydashboardstub.utils.ObligationsData.*
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController

import javax.inject.Inject
import scala.concurrent.ExecutionContext

@Singleton
class EtmpController @Inject()(
                                cc: ControllerComponents,
                                jsonSchemaHelper: JsonSchemaHelper
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
            case "IN9001001001" =>
              generateObligationsResponse(
                data = returnsOverMultipleYears,
                dateRange = dateRange
              )

            case "IN9002002002" =>
              generateObligationsResponse(
                data = returnsOverSixYears,
                dateRange = dateRange
              )

            case "IN9005999997" =>
              generateObligationsResponse(
                data = transferringMsid,
                dateRange = dateRange
              )

            case "IN9001144663" =>
              generateObligationsResponse(
                data = activeNoReturns,
                dateRange = dateRange
              )

            case "IN9008888883" =>
              generateObligationsResponse(
                data = dueReturnsSomeOverdue,
                dateRange = dateRange
              )

            case "IN9008888884" =>
              generateObligationsResponse(
                data = noOverdueReturns,
                dateRange = dateRange
              )

            case "IN9008888886" =>
              generateObligationsResponse(
                data = onlyPreviousRegistrations,
                dateRange = dateRange
              )

            case "IN9008888887" =>
              generateObligationsResponse(
                data = multipleActiveClientsNoPreviousClients,
                dateRange = dateRange
              )

            case "IN9001234567" =>
              generateObligationsResponse(
                data = multipleData,
                dateRange = dateRange
              )

            case "IN9000306831" =>
              generateObligationsResponse(
                data = excludedIntermediaryFulfilled,
                dateRange = dateRange
              )

            case "IN9000306832" =>
              generateObligationsResponse(
                data = excludedIntermediaryOpen,
                dateRange = dateRange
              )

            case _ =>
              generateObligationsResponse(
                data = defaultData,
                dateRange = dateRange
              )
          }
        }

        Ok(Json.toJson(generateObligations(idNumber, dateRange))).toFuture
      }
  }
}
