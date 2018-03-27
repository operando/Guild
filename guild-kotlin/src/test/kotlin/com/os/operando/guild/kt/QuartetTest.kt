package com.os.operando.guild.kt

import org.hamcrest.Matchers.`is`
import org.junit.Assert.*
import org.junit.Test

class QuartetTest {

    @Test
    fun test() {
        val quartet = 1 to 10L to true to "quartet"
        assertThat(quartet.first, `is`(1))
        assertThat(quartet.second, `is`(10L))
        assertThat(quartet.third, `is`(true))
        assertThat(quartet.fourth, `is`("quartet"))
    }

    @Test
    fun testToList() {
        val l = (0 to 1 to 2 to 3).toList()
        assertThat(l.size, `is`(4))
        assertThat(l[0], `is`(0))
        assertThat(l[1], `is`(1))
        assertThat(l[2], `is`(2))
        assertThat(l[3], `is`(3))
    }
}