package _2_Movie.step2

import java.time.Duration

class Movie(
    val title: String,
    val runningTime: Duration,
    val fee: Money,
    var discountPolicy: DiscountPolicy // 하나의 할인정책만 허용
) {
    fun calculateMovieFee(screening: Screening) =
        fee.minus(discountPolicy.calculateDiscountAmount(screening))

    fun changeDiscountPolicy(discountPolicy: DiscountPolicy) {
        this.discountPolicy = discountPolicy
    }
}
