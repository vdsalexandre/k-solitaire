package domain.game

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class GenerateDeckTest {

    @Test
    fun `should generate a deck with 52 different cards`() {
        val deck = Deck()

        assertThat(deck.cards.size).isEqualTo(52)
    }
}