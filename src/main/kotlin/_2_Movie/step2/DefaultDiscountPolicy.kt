package _2_Movie.step2

// 할인정책
// 영화(1) : 할인정책(0..N)
abstract class DefaultDiscountPolicy(
    vararg conditions: DiscountCondition // 여러개의 할인조건 허용
) : DiscountPolicy {
    private val conditions: List<DiscountCondition> = conditions.toList()

    override fun calculateDiscountAmount(screening: Screening): Money {
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
