package _2_Movie.step1

class SequenceCondition(
    val sequence: Int
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening) = screening.isSequence(sequence)
}
