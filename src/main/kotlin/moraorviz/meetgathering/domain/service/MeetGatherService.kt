package moraorviz.meetgathering.domain.service

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.http.MediaType
import reactor.core.publisher.Flux
import org.springframework.web.reactive.function.client.WebClient

class MeetGatherService(private val webClient: WebClient) {

    fun streamFrom(): Flux<Meet> {
        val url = "http://stream.meetup.com/2/rsvps"
        return this.webClient.mutate().baseUrl(url).build()
                .get()
                .accept(MediaType.TEXT_EVENT_STREAM)
                .retrieve().bodyToFlux(Meet::class.java)
    }
}
