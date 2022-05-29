package _2_Movie.step2

import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        val screeningStartTime = screening.getStartTime()

        return screeningStartTime.dayOfWeek.equals(dayOfWeek) &&
            startTime <= screeningStartTime.toLocalTime() &&
            endTime >= screeningStartTime.toLocalTime()
    }
}
