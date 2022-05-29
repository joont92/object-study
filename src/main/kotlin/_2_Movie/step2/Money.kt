package _2_Movie.step2

import java.math.BigDecimal

// BigDecimal을 사용할수도 있지만, Money라는 객체를 사용함으로써 개념을 좀 더 명시적으로 표현할 수 있다
class Money(
    val amount: BigDecimal
) {
    fun plus(amount: Money) = Money(this.amount.add(amount.amount))

    fun minus(amount: Money) = Money(this.amount.subtract(amount.amount))

    fun times(percent: Double) = Money(this.amount.multiply(BigDecimal.valueOf(percent)))

    fun isLessThan(other: Money) = amount < other.amount

    fun isGreatherThanOrEqual(other: Money) = amount >= other.amount

    companion object {
        val ZERO = wons(0)

        fun wons(amount: Long) =
            Money(BigDecimal.valueOf(amount))
    }
}
