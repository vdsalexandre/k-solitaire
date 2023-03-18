package domain.collection

import domain.model.Card
import java.util.Deque
import java.util.LinkedList

class PileSequence() : Sequence() {

    override val cards: Deque<Card>
        get() = LinkedList()

    override fun move(destination: Sequence): Boolean {
        return false
    }

    override fun isValidMove(destination: Sequence): Boolean {
        return false
    }

    override fun append(card: Card) {
        cards.addLast(card)
    }
}