package com.os.operando.guild.kt

import org.hamcrest.Matchers
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDateTime
import java.util.*

class EnneadTest {

    @Test
    fun test() {
        val now = LocalDateTime.now()
        val uuid = UUID.randomUUID()
        val ennead = 1 to 10L to true to now to "ennead" to listOf("ennead") to Long.MAX_VALUE to 1.0 to uuid
        assertThat(ennead.first, Matchers.`is`(1))
        assertThat(ennead.second, Matchers.`is`(10L))
        assertThat(ennead.third, Matchers.`is`(true))
        assertThat(ennead.fourth, Matchers.`is`(now))
        assertThat(ennead.five, Matchers.`is`("ennead"))
        assertThat(ennead.six, Matchers.`is`(listOf("ennead")))
        assertThat(ennead.seven, Matchers.`is`(Long.MAX_VALUE))
        assertThat(ennead.eight, Matchers.`is`(1.0))
        assertThat(ennead.nine, Matchers.`is`(uuid))
    }

    @Test
    fun testToList() {
        val l = (0 to 1 to 2 to 3 to 4 to 5 to 6 to 7 to 8).toList()
        assertThat(l.size, Matchers.`is`(9))
        assertThat(l[0], Matchers.`is`(0))
        assertThat(l[1], Matchers.`is`(1))
        assertThat(l[2], Matchers.`is`(2))
        assertThat(l[3], Matchers.`is`(3))
        assertThat(l[4], Matchers.`is`(4))
        assertThat(l[5], Matchers.`is`(5))
        assertThat(l[6], Matchers.`is`(6))
        assertThat(l[7], Matchers.`is`(7))
        assertThat(l[8], Matchers.`is`(8))
    }
}