package _2_Movie.step2

// 할인조건
// 할인정책(1) : 할인조건(1..N)
interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
