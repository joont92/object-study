package _2_Movie.step2

import java.time.Duration
import java.time.LocalDateTime

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
    val starwars = Movie(
        "스타워즈",
        Duration.ofMinutes(180),
        Money.wons(11000),
        NoneDiscountPolicy()
    )
    // 의존성을 쉽게 변경할 수 있다
    starwars.changeDiscountPolicy(AmountDiscountPolicy(
        Money.wons(1000),
        SequenceCondition(1),
        SequenceCondition(10)
    ))
}
