package domain.collection

import domain.model.Card

class TableauSequence : Sequence() {
    override val cards: ArrayList<Card>
        get() = ArrayList()

    override fun move(destination: Sequence): Boolean {
        TODO("Not yet implemented")
    }

    override fun isValidMove(destination: Sequence): Boolean {
        TODO("Not yet implemented")
    }

    override fun append(card: Card) {
        TODO("Not yet implemented")
    }

    fun extend(cards: ArrayList<Card>) {

    }
}