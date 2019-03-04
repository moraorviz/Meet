package moraorviz.meetgathering.domain.service

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Meet(@JsonProperty("rsvp_id") val rsvpId: String = "", val group: Group = Group("", "", ""))