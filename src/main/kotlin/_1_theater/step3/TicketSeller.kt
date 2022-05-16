package _1_theater.step3

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience) {
        ticketOffice.sellTicketTo(audience)
    }
}
