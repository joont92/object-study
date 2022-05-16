package _1_theater.step2

class TicketOffice(
    var amount: Long,
    vararg tickets: Ticket
) {
    val tickets: MutableList<Ticket> = tickets.toMutableList()

    fun sellTicket(): Ticket = tickets.removeFirst()

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}
