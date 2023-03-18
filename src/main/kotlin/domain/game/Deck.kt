package domain.game

import domain.model.Card
import domain.model.Ranks
import domain.model.Suits

class Deck {
    val cards: Set<Card> = generateDeck()

    private fun generateDeck(): Set<Card> {
        return Suits.values().flatMap { suit ->
            Ranks.values().map { rank ->
                Card(suit, rank)
            }
        }.toSet()
    }
}
