package _1_theater.step2

class Audience(
    private val bag: Bag
) {
    // STEP 3
    // - audience, ticketSeller는 자신의 문제를 스스로 해결하는 **자율적인 존재**가 됨
    //   - 객체 스스로 자신의 데이터를 책임져야함 -> 객체의 응집도가 높아짐
    // - **캡슐화 + 메시지를 통해서만 상호작용**이 핵심이다
    fun buy(ticket: Ticket): Long {
        if (bag.invitation != null) {
            bag.ticket = ticket
            return 0
        } else {
            bag.minusAmount(ticket.fee)
            bag.ticket = ticket
            return ticket.fee
        }
    }
}
