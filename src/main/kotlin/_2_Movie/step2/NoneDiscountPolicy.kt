package _2_Movie.step2

class NoneDiscountPolicy : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening) = Money.ZERO
}
