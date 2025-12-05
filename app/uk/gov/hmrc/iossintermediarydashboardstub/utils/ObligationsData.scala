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

import uk.gov.hmrc.iossintermediarydashboardstub.models.etmp.{EtmpObligation, EtmpObligationDetails, EtmpObligationIdentification, EtmpObligations, EtmpObligationsFulfilmentStatus}

object ObligationsData {

  val defaultSuccessfulResponse: EtmpObligations = EtmpObligations(
    obligations = Seq(
      EtmpObligation(
        identification = EtmpObligationIdentification("IM9001234567"),
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
        identification = EtmpObligationIdentification("IM9001234568"),
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
      )
    )
  )
}
