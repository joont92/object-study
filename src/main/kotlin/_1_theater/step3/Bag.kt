package _1_theater.step3

class Bag private constructor(
    var amount: Long,
    val invitation: Invitation?,
    var ticket: Ticket?
) {
    constructor(amount: Long) : this(amount, null, null)

    constructor(invitation: Invitation, amount: Long) : this(amount, invitation, null)

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun hold(ticket: Ticket): Long {
        if (invitation != null) {
            this.ticket = ticket
            return 0
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            return ticket.fee
        }
    }
}
