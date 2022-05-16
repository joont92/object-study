package _1_theater.step2

class Bag private constructor(
    var amount: Long,
    val invitation: Invitation?,
    var ticket: Ticket?
) {
    constructor(amount: Long) : this(amount, null, null)

    constructor(invitation: Invitation, amount: Long) : this(amount, invitation, null)

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}
