package com.os.operando.guild.kt

/**
 * A tuple of six elements.
 *
 * @param F  first element type
 * @param S  second element type
 * @param T  third element type
 * @param FO fourth element type
 * @param FI five element type
 * @param SI six element type
 * @property first First value
 * @property second Second value
 * @property third Third value
 * @property fourth Fourth value
 * @property five Five value
 * @property six Six value
 */
data class Sextet<out F, out S, out T, out FO, out FI, out SI>(
        val first: F,
        val second: S,
        val third: T,
        val fourth: FO,
        val five: FI,
        val six: SI) {
}

infix fun <A, B, C, D, E, F, G> Sextet<A, B, C, D, E, F>.to(that: G): Septet<A, B, C, D, E, F, G>
        = Septet(this.first, this.second, this.third, this.fourth, this.five, this.six, that)