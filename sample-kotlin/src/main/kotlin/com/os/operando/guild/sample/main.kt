package com.os.operando.guild.sample

import com.os.operando.guild.to
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val pair = 1 to "pair"
    println(pair.first)
    println(pair.second)

    val triple = 1 to 10L to "triple"
    println(triple.first)
    println(triple.second)
    println(triple.third)

    val quartet = 1 to 10L to true to "quartet"
    println(quartet.first)
    println(quartet.second)
    println(quartet.third)
    println(quartet.fourth)

    val quintet = 1 to 10L to true to LocalDateTime.now() to "quintet"
    println(quintet.first)
    println(quintet.second)
    println(quintet.third)
    println(quintet.fourth)
    println(quintet.five)

    val sextet = 1 to 10L to true to LocalDateTime.now() to "sextet" to listOf("sextet")
    println(sextet.first)
    println(sextet.second)
    println(sextet.third)
    println(sextet.fourth)
    println(sextet.five)
    println(sextet.six)

    val septet = 1 to 10L to true to LocalDateTime.now() to "septet" to listOf("septet") to Long.MAX_VALUE
    println(septet.first)
    println(septet.second)
    println(septet.third)
    println(septet.fourth)
    println(septet.five)
    println(septet.six)
    println(septet.seven)
}