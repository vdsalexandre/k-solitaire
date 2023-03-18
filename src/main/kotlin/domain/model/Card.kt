package domain.model

data class Card(val suits: Suits, val ranks: Ranks, var masks: Boolean = true) {

    fun sameColor(card: Card) = suits.color == card.suits.color

    fun rankDifference(card: Card) = ranks.value == card.ranks.value
}
