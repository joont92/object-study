package _2_Movie.step1

import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

class Reservation(
    private val customer: Customer,
    private val screening: Screening,
    private val fee: Money,
    private val audienceCount: Int
)

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