package moraorviz.meetgathering

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.reactive.function.client.WebClient
import moraorviz.meetgathering.domain.service.MeetGatherService
import moraorviz.meetgathering.domain.service.MeetGatherRunner

/**
 * @author mario on 04/03/19.
 * Project meet-consumer
 */
@SpringBootApplication
@EnableScheduling
open class MeetGatheringApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(MeetGatheringApplication::class.java, *args)
            val webClient = WebClient.create()
            val meetGatherService = MeetGatherService(webClient)
            val meetGatherRunner = MeetGatherRunner(meetGatherService)
            meetGatherRunner.receive()

        }
    }

}

