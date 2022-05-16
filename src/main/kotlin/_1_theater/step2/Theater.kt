package _1_theater.step2

class Theater(
    private val ticketSeller: TicketSeller
) {
    // STEP 1
    // theater는 ticketSeller만 알고 있으면 됨
    // ticketSeller가 ticketOffice에 접근한다는 '구현'단계의 내용은 공개하지 않는다 -> 결합도를 낮추기 위한 첫번째 과정
    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}
