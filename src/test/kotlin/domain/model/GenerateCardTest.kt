package domain.model

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotEqualTo
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

class GenerateCardTest {

    @Test
    fun `should generate and compare an A of HEARTS and an A of CLUBS`() {
        val cardOfHearts = Card(suits = Suits.HEARTS, ranks = Ranks.A)
        val cardOfClubs = Card(suits = Suits.CLUBS, ranks = Ranks.A)

        assertThat(cardOfHearts.suits).isNotEqualTo(cardOfClubs.suits)
        assertThat(cardOfHearts.ranks).isEqualTo(cardOfClubs.ranks)
    }

    @Test
    fun `should generate and compare two cards of the same color`() {
        val cardOfClubs = Card(suits = Suits.CLUBS, ranks = Ranks.TEN)
        val cardOfSpades = Card(suits = Suits.SPADES, ranks = Ranks.D)

        assertThat(cardOfClubs.sameColor(cardOfSpades)).isTrue()
    }

    @Test
    fun `should generate two cards with different ranking and compare them`() {
        val cardOfDiamonds = Card(suits = Suits.DIAMONDS, ranks = Ranks.J)
        val cardOfHeart = Card(suits = Suits.HEARTS, ranks = Ranks.J)

        assertThat(cardOfDiamonds.rankDifference(cardOfHeart)).isTrue()
    }
}