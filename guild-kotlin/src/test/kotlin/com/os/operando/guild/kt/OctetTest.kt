package com.os.operando.guild.kt

import org.hamcrest.Matchers
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime

class OctetTest {

    @Test
    fun test() {
        val now = LocalDateTime.now()
        val qctet = 1 to 10L to true to now to "qctet" to listOf("qctet") to Long.MAX_VALUE to 1.0
        assertThat(qctet.first, Matchers.`is`(1))
        assertThat(qctet.second, Matchers.`is`(10L))
        assertThat(qctet.third, Matchers.`is`(true))
        assertThat(qctet.fourth, Matchers.`is`(now))
        assertThat(qctet.five, Matchers.`is`("qctet"))
        assertThat(qctet.six, Matchers.`is`(listOf("qctet")))
        assertThat(qctet.seven, Matchers.`is`(Long.MAX_VALUE))
        assertThat(qctet.eight, Matchers.`is`(1.0))
    }

    @Test
    fun testToList() {
        val l = (0 to 1 to 2 to 3 to 4 to 5 to 6 to 7).toList()
        assertThat(l.size, Matchers.`is`(8))
        assertThat(l[0], Matchers.`is`(0))
        assertThat(l[1], Matchers.`is`(1))
        assertThat(l[2], Matchers.`is`(2))
        assertThat(l[3], Matchers.`is`(3))
        assertThat(l[4], Matchers.`is`(4))
        assertThat(l[5], Matchers.`is`(5))
        assertThat(l[6], Matchers.`is`(6))
        assertThat(l[7], Matchers.`is`(7))
    }
}