package moraorviz.meetgathering.domain.service

class MeetGatherRunner(private val meetGatherService: MeetGatherService) {
    fun receive() {
        val streamFrom = this.meetGatherService.streamFrom()
        val subscribe = streamFrom.log().subscribe()
    }
}