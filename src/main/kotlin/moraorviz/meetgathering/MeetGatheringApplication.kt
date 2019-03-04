package moraorviz.meetgathering

import moraorviz.meetgathering.domain.service.MeetGatherService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

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

        }
    }

}

