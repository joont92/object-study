package _2_Movie.step1

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