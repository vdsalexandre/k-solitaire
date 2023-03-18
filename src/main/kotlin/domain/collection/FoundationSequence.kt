package domain.collection

import domain.model.Card

class FoundationSequence : Sequence() {
    override val cards: MutableSet<Card>
        get() = mutableSetOf()

    override fun move(destination: Sequence): Boolean {
        TODO("Not yet implemented")
    }

    override fun isValidMove(destination: Sequence): Boolean {
        TODO("Not yet implemented")
    }

    override fun append(card: Card) {
        TODO("Not yet implemented")
    }
}