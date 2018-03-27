package com.os.operando.guild.kt

import org.hamcrest.Matchers
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime

class SextetTest {

    @Test
    fun test() {
        val now = LocalDateTime.now()
        val sextet = 1 to 10L to true to now to "sextet" to listOf("sextet")
        assertThat(sextet.first, Matchers.`is`(1))
        assertThat(sextet.second, Matchers.`is`(10L))
        assertThat(sextet.third, Matchers.`is`(true))
        assertThat(sextet.fourth, Matchers.`is`(now))
        assertThat(sextet.five, Matchers.`is`("sextet"))
        assertThat(sextet.six, Matchers.`is`(listOf("sextet")))
    }

    @Test
    fun testToList() {
        val l = (0 to 1 to 2 to 3 to 4 to 5).toList()
        assertThat(l.size, Matchers.`is`(6))
        assertThat(l[0], Matchers.`is`(0))
        assertThat(l[1], Matchers.`is`(1))
        assertThat(l[2], Matchers.`is`(2))
        assertThat(l[3], Matchers.`is`(3))
        assertThat(l[4], Matchers.`is`(4))
        assertThat(l[5], Matchers.`is`(5))
    }
}