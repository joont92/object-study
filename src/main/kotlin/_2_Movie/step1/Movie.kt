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

    // 안좋은 코드
    fun calculateMovieFee_bad(screening: Screening): Money {
        // 할인정책 관심사를 movie도 가지고 있음
        if (discountPolicy == null) {
            return fee
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening))
    }
}
