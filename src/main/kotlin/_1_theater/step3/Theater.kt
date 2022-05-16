package _1_theater.step3

class Theater(
    private val ticketSeller: TicketSeller
) {
    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}
