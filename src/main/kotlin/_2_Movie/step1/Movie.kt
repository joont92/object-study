package _2_Movie.step1

import java.time.Duration

class Movie(
    val title: String,
    val runningTime: Duration,
    val fee: Money,
    val discountPolicy: DiscountPolicy // 하나의 할인정책만 허용
) {
    fun calculateMovieFee(screening: Screening) =
        fee.minus(discountPolicy.calculateDiscountAmount(screening))
}
