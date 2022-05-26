package _2_Movie.step1

class PercentDiscountPolicy(
    private val percent: Double,
    vararg conditions: DiscountCondition
) : DiscountPolicy(*conditions) {
    override fun getDiscountAmount(screening: Screening) = screening.getMovieFee().times(percent)
}
