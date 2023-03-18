package domain.collection

import domain.model.Card

abstract class Sequence {
    abstract val cards: Collection<Card>

    open fun topCard() { }
    open fun pop() { }

    abstract fun move(destination: Sequence): Boolean
    abstract fun isValidMove(destination: Sequence): Boolean
    abstract fun append(card: Card)
}