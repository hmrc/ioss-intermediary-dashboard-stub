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

import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.{EtmpObligation, EtmpObligationDetails, EtmpObligationIdentification, EtmpObligations, EtmpObligationsFulfilmentStatus, ObligationsDateRange}

import java.time.{LocalDate, Month}
import java.time.Month._

object ObligationsData {

  val oneMonthAgoPeriod = getEtmpStringFromDate(LocalDate.now().minusMonths(1))
  val twoMonthAgosPeriod = getEtmpStringFromDate(LocalDate.now().minusMonths(2))

  val defaultSuccessfulResponse: EtmpObligations = EtmpObligations(
    obligations = Seq(
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144771"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AL"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AK"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AJ"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144772"),
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
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144773"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AL"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AK"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AJ"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144774"),
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
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144771"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144772"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144773"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144774"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144775"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144776"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144777"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144778"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144881"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144882"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144883"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144884"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144885"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144886"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144661"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144662"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144663"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144664"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AA"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AB"
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = "25AC"
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144833"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144844"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144855"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144866"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144877"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = twoMonthAgosPeriod
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144888"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Fulfilled,
            periodKey = twoMonthAgosPeriod
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144899"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = twoMonthAgosPeriod
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = oneMonthAgoPeriod
          )
        )
      ),
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001144800"),
        obligationDetails = Seq(
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = twoMonthAgosPeriod
          ),
          EtmpObligationDetails(
            status = EtmpObligationsFulfilmentStatus.Open,
            periodKey = oneMonthAgoPeriod
          )
        )
      )
    )
  )

  private def getEtmpStringFromDate(date: LocalDate): String = {
    s"${toEtmpYearString(date.getYear)}${toEtmpMonthString(date.getMonth)}"
  }

  private def toEtmpYearString(year: Int): String =
    year.toString.substring(2)

  private def toEtmpMonthString(month: Month): String = {
    month match {
      case JANUARY => "AA"
      case FEBRUARY => "AB"
      case MARCH => "AC"
      case APRIL => "AD"
      case MAY => "AE"
      case JUNE => "AF"
      case JULY => "AG"
      case AUGUST => "AH"
      case SEPTEMBER => "AI"
      case OCTOBER => "AJ"
      case NOVEMBER => "AK"
      case DECEMBER => "AL"
    }
  }

  def generateObligationsResponse(
                                   clientsIossNumbers: Seq[String],
                                   dateRange: ObligationsDateRange
                                 ): EtmpObligations = {
    EtmpObligations(
      obligations =
        for {
          clientIossNumber <- clientsIossNumbers
        } yield {
          EtmpObligation(
            identification = EtmpObligationIdentification(clientIossNumber),
            obligationDetails =
              getAllPeriodsWithinDateRange(dateRange).zipWithIndex.map { (period, _) =>
                EtmpObligationDetails(
                  status = EtmpObligationsFulfilmentStatus.Open,
                  periodKey = period
                )
              }
          )
        }
    )
  }

  private def getAllPeriodsWithinDateRange(dateRange: ObligationsDateRange): Seq[String] = {

    val myDateRange = Iterator.iterate(dateRange.from) { iteratedMonth =>
      iteratedMonth.plusMonths(1)
    }.takeWhile(_.isBefore(dateRange.to))

    for {
      date <- myDateRange.toList
    } yield {
      val shortYear: String = date.getYear.toString.substring(2, 4)

      val aMonth = date.getMonthValue match {
        case 1 => "AA"
        case 2 => "AB"
        case 3 => "AC"
        case 4 => "AD"
        case 5 => "AE"
        case 6 => "AF"
        case 7 => "AG"
        case 8 => "AH"
        case 9 => "AI"
        case 10 => "AJ"
        case 11 => "AK"
        case 12 => "AL"
      }

      s"$shortYear$aMonth"
    }
  }
}
