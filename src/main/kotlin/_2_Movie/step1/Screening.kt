package _2_Movie.step1

import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    private val whenScreened: LocalDateTime
) {
    fun getStartTime() = whenScreened

    fun isSequence(sequence: Int) = this.sequence == sequence

    fun getMovieFee() = movie.fee

    // 영화를 예매한다(X) -> 상영을 예매한다(O)
    fun reserve(customer: Customer, audienceCount: Int) =
        Reservation(customer, this, calculateFee(audienceCount), audienceCount)

    private fun calculateFee(audienceCount: Int) =
        movie.calculateMovieFee(this).times(audienceCount.toDouble())
}

fun main() {
    val avatar = Movie(
        "아바타",
        Duration.ofMinutes(120),
        Money.wons(10000),
        AmountDiscountPolicy(
            Money.wons(800),
            SequenceCondition(1),
            SequenceCondition(10),
            PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
            PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(18, 0), LocalTime.of(19, 59))
        )
    )

    val titanic = Movie(
        "타이타닉",
        Duration.ofMinutes(180),
        Money.wons(11000),
        PercentDiscountPolicy(
            0.1,
            PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
            SequenceCondition(2),
            PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
        )
    )
}
