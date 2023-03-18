package domain.game

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isFalse
import assertk.assertions.isNotEqualTo
import assertk.assertions.isSameAs
import assertk.assertions.isTrue
import domain.model.Card
import domain.model.Ranks
import domain.model.Suits
import org.junit.jupiter.api.Test

class GenerateDeckTest {

    @Test
    fun `should generate an ordered deck with 52 different cards`() {
        val expectedFirstCard = Card(Suits.HEARTS, Ranks.A)
        val expectedLastCard = Card(Suits.CLUBS, Ranks.K)

        val firstDeck = Deck()
        val secondDeck = Deck()

        assertThat(firstDeck.cards.size).isEqualTo(52)
        assertThat(firstDeck.cards.first()).isEqualTo(expectedFirstCard)
        assertThat(firstDeck.cards.last()).isEqualTo(expectedLastCard)
        assertThat(firstDeck.cards == secondDeck.cards).isTrue()
    }

    @Test
    fun `should generate and shuffle a deck with 52 different cards`() {
        val deck = Deck()
        val shuffledDeck = Deck()

        shuffledDeck.shuffle()

        assertThat(deck.cards.size).isEqualTo(52)
        assertThat(deck).isNotEqualTo(shuffledDeck)
    }
}