package com.os.operando.guild

/**
 * A tuple of eight elements.
 *
 * @param F  first element type
 * @param S  second element type
 * @param T  third element type
 * @param FO fourth element type
 * @param FI five element type
 * @param SI six element type
 * @param SE seven element type
 * @param E eight element type
 * @property first First value
 * @property second Second value
 * @property third Third value
 * @property fourth Fourth value
 * @property five Five value
 * @property six Six value
 * @property seven Seven value
 * @property eight Eight value
 */
data class Octet<out F, out S, out T, out FO, out FI, out SI, out SE, out E>(
        val first: F,
        val second: S,
        val third: T,
        val fourth: FO,
        val five: FI,
        val six: SI,
        val seven: SE,
        val eight: E) {
}

infix fun <A, B, C, D, E, F, G, H, I> Octet<A, B, C, D, E, F, G, H>.to(that: I): Ennead<A, B, C, D, E, F, G, H, I>
        = Ennead(this.first, this.second, this.third, this.fourth, this.five, this.six, this.seven, this.eight, that)