enum class Daypart {
    morning,
    afternoon,
    evening
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int,
)

fun main() {
    val evento = Event(title="Study Kotlin", description="Commit to studying Kotlin at least 15 minutes per day.", daypart=Daypart.morning, duration=15)
       println("Title: "+evento.title+ ", Description: "+evento.description+", Daypart: "+evento.daypart+", Duration: "+evento.duration)
}

