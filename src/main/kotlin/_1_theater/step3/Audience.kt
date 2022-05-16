package _1_theater.step3

class Audience(
    private val bag: Bag
) {
    fun buy(ticket: Ticket): Long = bag.hold(ticket)
}
