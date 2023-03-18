package domain.model

import java.awt.Color
import java.awt.Color.BLACK
import java.awt.Color.RED

enum class Suits(val value: Int, val color: Color) {
    HEARTS(1, RED),
    DIAMONDS(2, RED),
    SPADES(3, BLACK),
    CLUBS(4, BLACK)
}