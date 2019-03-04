package moraorviz.meetgathering.domain.service

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

    @Document
    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Group(@Id @JsonProperty("group_id") val groupId: String = "", @JsonProperty("group_lon") val groupLon: String = "",
                     @JsonProperty("group_lat") val groupLat: String = "")
