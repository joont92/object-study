package _2_Movie.step2

interface DiscountPolicy {
    fun calculateDiscountAmount(screening: Screening): Money
}
