package _1_theater.step1

class Theater(
    val ticketSeller: TicketSeller
) {
    /*
    문제점
    1. 극장이 관람객의 가방, 티켓판매소의 돈이나 티켓에 직접 접근하는 등 코드가 상식적으로 잘 읽히지 않는다
    2. Theater가 다른 클래스에 대해 너무 많이 알고 있다
        - 알고있는 클래스의 개수가 많을수록 변경 가능성도 더 커진다
        - audience, ticketSeller, bag, ticketOffice등은 객체가 아니라 단순 데이터처럼 사용됨(수동적 존재) == 절차적 프로그래밍
     */
    fun enter(audience: Audience) {
        if (audience.bag.invitation != null) {
            val ticket = ticketSeller.ticketOffice.sellTicket()
            audience.bag.ticket = ticket
        } else {
            val ticket = ticketSeller.ticketOffice.sellTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketSeller.ticketOffice.plusAmount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}
