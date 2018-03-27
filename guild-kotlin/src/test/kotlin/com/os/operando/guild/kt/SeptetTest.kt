package com.os.operando.guild.kt

import org.hamcrest.Matchers
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime

class SeptetTest {

    @Test
    fun test() {
        val now = LocalDateTime.now()
        val septet = 1 to 10L to true to now to "septet" to listOf("septet") to Long.MAX_VALUE
        assertThat(septet.first, Matchers.`is`(1))
        assertThat(septet.second, Matchers.`is`(10L))
        assertThat(septet.third, Matchers.`is`(true))
        assertThat(septet.fourth, Matchers.`is`(now))
        assertThat(septet.five, Matchers.`is`("septet"))
        assertThat(septet.six, Matchers.`is`(listOf("septet")))
        assertThat(septet.seven, Matchers.`is`(Long.MAX_VALUE))
    }

    @Test
    fun testToList() {
        val l = (0 to 1 to 2 to 3 to 4 to 5 to 6).toList()
        assertThat(l.size, Matchers.`is`(7))
        assertThat(l[0], Matchers.`is`(0))
        assertThat(l[1], Matchers.`is`(1))
        assertThat(l[2], Matchers.`is`(2))
        assertThat(l[3], Matchers.`is`(3))
        assertThat(l[4], Matchers.`is`(4))
        assertThat(l[5], Matchers.`is`(5))
        assertThat(l[6], Matchers.`is`(6))
    }
}