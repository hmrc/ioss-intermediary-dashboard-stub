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

import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.EtmpObligationsFulfilmentStatus.{Fulfilled, Open}
import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.{EtmpObligation, EtmpObligationDetails, EtmpObligationIdentification, EtmpObligations, EtmpObligationsFulfilmentStatus, ObligationsDateRange}

import java.time.LocalDate

object ObligationsData {

  val multipleData: Map[String, Map[LocalDate, EtmpObligationsFulfilmentStatus]] = Map(
    "IM9001144771" -> Map(
      LocalDate.of(2025, 12, 1) -> Open,
      LocalDate.of(2025, 11, 1) -> Open,
      LocalDate.of(2025, 10, 1) -> Fulfilled
    ),
    "IM9001144772" -> Map(
      LocalDate.of(2025, 12, 1) -> Open,
      LocalDate.of(2025, 11, 1) -> Open,
      LocalDate.of(2025, 10, 1) -> Fulfilled
    ),
    "IM9001144773" -> Map(
      LocalDate.of(2025, 12, 1) -> Open,
      LocalDate.of(2025, 11, 1) -> Open,
      LocalDate.of(2025, 10, 1) -> Fulfilled
    ),
    "IM9001144774" -> Map(
      LocalDate.of(2025, 12, 1) -> Open,
      LocalDate.of(2025, 11, 1) -> Fulfilled,
      LocalDate.of(2025, 10, 1) -> Fulfilled
    ),
    "IM9001144771" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144772" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144773" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144774" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144775" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144776" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144777" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144778" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144881" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144882" -> Map(
      LocalDate.of(2025, 3, 1) -> Fulfilled,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144883" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144884" -> Map(
      LocalDate.of(2025, 3, 1) -> Fulfilled,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144885" -> Map(
      LocalDate.of(2025, 3, 1) -> Fulfilled,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144886" -> Map(
      LocalDate.of(2025, 3, 1) -> Fulfilled,
      LocalDate.of(2025, 2, 1) -> Fulfilled,
      LocalDate.of(2025, 1, 1) -> Fulfilled
    ),
    "IM9001144661" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144662" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144663" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144664" -> Map(
      LocalDate.of(2025, 3, 1) -> Open,
      LocalDate.of(2025, 2, 1) -> Open,
      LocalDate.of(2025, 1, 1) -> Open
    ),
    "IM9001144833" -> Map(
      LocalDate.now().minusMonths(1) -> Fulfilled
    ),
    "IM9001144844" -> Map(
      LocalDate.now().minusMonths(1) -> Open
    ),
    "IM9001144855" -> Map(
      LocalDate.now().minusMonths(1) -> Fulfilled
    ),
    "IM9001144866" -> Map(
      LocalDate.now().minusMonths(1) -> Open
    ),
    "IM9001144877" -> Map(
      LocalDate.now().minusMonths(2) -> Fulfilled,
      LocalDate.now().minusMonths(1) -> Open
    ),
    "IM9001144888" -> Map(
      LocalDate.now().minusMonths(2) -> Fulfilled,
      LocalDate.now().minusMonths(1) -> Open
    ),
    "IM9001144899" -> Map(
      LocalDate.now().minusMonths(2) -> Open,
      LocalDate.now().minusMonths(1) -> Open
    ),
    "IM9001144800" -> Map(
      LocalDate.now().minusMonths(2) -> Open,
      LocalDate.now().minusMonths(1) -> Open
    )
  )

  val multipleActiveClientsNoPreviousClients: Map[String, Map[LocalDate, EtmpObligationsFulfilmentStatus]] = Map(
    "IM9001144881" -> Map(
      LocalDate.now().minusMonths(3) -> Fulfilled,
      LocalDate.now().minusMonths(2) -> Open,
      LocalDate.now().minusMonths(1) -> Open,
      LocalDate.now() -> Open
    ),
    "IM9001144882" -> Map(
      LocalDate.now().minusMonths(3) -> Fulfilled,
      LocalDate.now().minusMonths(2) -> Open
    ),
    "IM9001144883" -> Map(
      LocalDate.now().minusMonths(3) -> Fulfilled,
      LocalDate.now().minusMonths(2) -> Open
    )
  )

  val defaultData: Map[String, Map[LocalDate, EtmpObligationsFulfilmentStatus]] = Map(
    "100000001" -> Map(
      LocalDate.now().minusMonths(3) -> Fulfilled,
      LocalDate.now().minusMonths(2) -> Open,
      LocalDate.now().minusMonths(1) -> Open,
      LocalDate.now() -> Open
    ),
    "100000003" -> Map(
      LocalDate.now().minusMonths(3) -> Fulfilled,
      LocalDate.now().minusMonths(2) -> Open
    )
  )

  def generateObligationsResponse(
                                   data: Map[String, Map[LocalDate, EtmpObligationsFulfilmentStatus]],
                                   dateRange: ObligationsDateRange
                                 ): EtmpObligations = {
    EtmpObligations(
      obligations =
        (for {
          (iossNumber, periodsWithStatus) <- data
        } yield {
          EtmpObligation(
            identification = EtmpObligationIdentification(iossNumber),
            obligationDetails = buildObligationDetails(periodsWithStatus, dateRange)
          )
        }).toSeq
    )
  }

  private def buildObligationDetails(
                                      periodsWithStatus: Map[LocalDate, EtmpObligationsFulfilmentStatus],
                                      dateRange: ObligationsDateRange
                                    ): Seq[EtmpObligationDetails] = {

    val convertedPeriodsWithStatus: Map[String, EtmpObligationsFulfilmentStatus] = periodsWithStatus.map { (date, status) =>
      val periodKey: String = convertToPeriodKey(date.getYear, date.getMonthValue)
      (periodKey, status)
    }

    for {
      period <- getAllPeriodsWithinDateRange(dateRange)
    } yield {
      val status = convertedPeriodsWithStatus.getOrElse(period, Fulfilled)
      EtmpObligationDetails(
        status = status,
        periodKey = period
      )
    }
  }

  private def getAllPeriodsWithinDateRange(dateRange: ObligationsDateRange): Seq[String] = {

    val myDateRange = Iterator.iterate(dateRange.from) { iteratedMonth =>
      iteratedMonth.plusMonths(1)
    }.takeWhile(_.isBefore(dateRange.to))

    for {
      date <- myDateRange.toList
    } yield {
      convertToPeriodKey(date.getYear, date.getMonthValue)
    }
  }

  private def convertToPeriodKey(year: Int, monthValue: Int): String = {
    val shortYear: String = year.toString.substring(2, 4)
    val month = monthValue match {
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

    s"$shortYear$month"
  }
}
