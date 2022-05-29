package _2_Movie.step2

class SequenceCondition(
    val sequence: Int
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening) = screening.isSequence(sequence)
}
