package _1_theater.step3

class TicketOffice(
    var amount: Long,
    vararg tickets: Ticket
) {
    val tickets: MutableList<Ticket> = tickets.toMutableList()

    private fun sellTicket(): Ticket = tickets.removeFirst()

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

    // ticketOffice가 자신의 데이터를 직접 제어하면서 자율성이 높아졌지만, audience에 대한 의존성이 생겼다
    // -> 트레이드오프
    fun sellTicketTo(audience: Audience) {
        val ticket = sellTicket()
        val amount = audience.buy(ticket)
        plusAmount(amount)
    }
}
