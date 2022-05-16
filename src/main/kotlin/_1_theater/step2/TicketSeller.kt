package _1_theater.step2

class TicketSeller(
    // STEP 2
    // 캡슐화를 통해 객체 내부의 세부적인 사항(ticketOffice)을 감춤
    // ticketSeller.ticketOffice로의 접근이 제한됨으로써 타 객체와의 결합도가 낮아짐 -> **변경이 용이해짐**
    private val ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.sellTicket()
        val amount = audience.buy(ticket)
        ticketOffice.plusAmount(amount)
    }
}
