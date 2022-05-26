package _2_Movie.step1

// 할인정책
// 영화(1) : 할인정책(0..N)
abstract class DiscountPolicy(
    vararg conditions: DiscountCondition // 여러개의 할인조건 허용
) {
    private val conditions: List<DiscountCondition> = conditions.toList()

    fun calculateDiscountAmount(screening: Screening): Money {
        for (condition in conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    // template method pattern
    protected abstract fun getDiscountAmount(screening: Screening): Money
}
