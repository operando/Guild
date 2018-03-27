package com.os.operando.guild.kt

import org.hamcrest.Matchers
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime

class QuintetTest {

    @Test
    fun test() {
        val now = LocalDateTime.now()
        val quintet = 1 to 10L to true to now to "quintet"
        assertThat(quintet.first, Matchers.`is`(1))
        assertThat(quintet.second, Matchers.`is`(10L))
        assertThat(quintet.third, Matchers.`is`(true))
        assertThat(quintet.fourth, Matchers.`is`(now))
        assertThat(quintet.five, Matchers.`is`("quintet"))
    }

    @Test
    fun testToList() {
        val l = (0 to 1 to 2 to 3 to 4).toList()
        assertThat(l.size, Matchers.`is`(5))
        assertThat(l[0], Matchers.`is`(0))
        assertThat(l[1], Matchers.`is`(1))
        assertThat(l[2], Matchers.`is`(2))
        assertThat(l[3], Matchers.`is`(3))
        assertThat(l[4], Matchers.`is`(4))
    }
}