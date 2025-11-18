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

package uk.gov.hmrc.iossintermediarydashboardstub.utils

class EtmpGetObligationsData {

  val schemaPath: String = "/resources/schemas/etmp-get-obligations-schema.json"

  val invalidExample: String = """{"data": "invalid"}""".stripMargin

  val givenExample: String =
    """{
      |  "obligations": [
      |  {
      |     "identification": {
      |       "incomeSourceType": "ITSA",
      |       "referenceNumber": "IM9001234567",
      |       "referenceType": "IOSS"
      |     },
      |     "obligationDetails": [
      |     {
      |       "status": "O",
      |       "inboundCorrespondenceFromDate": "2023-01-01",
      |       "inboundCorrespondenceToDate": "2023-01-01",
      |       "inboundCorrespondenceDateReceived": "2023-01-01",
      |       "inboundCorrespondenceDueDate": "2023-01-01",
      |       "periodKey": "23AA"
      |      },
      |     {
      |       "status": "F",
      |       "inboundCorrespondenceFromDate": "2024-01-01",
      |       "inboundCorrespondenceToDate": "2024-01-01",
      |       "inboundCorrespondenceDueDate": "2024-01-01",
      |       "periodKey": "24AA"
      |      }
      |      ]
      |    }
      |  ]
      |}""".stripMargin
}
