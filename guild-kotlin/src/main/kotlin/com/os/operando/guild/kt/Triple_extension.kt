package com.os.operando.guild.kt

infix fun <A, B, C, D> Triple<A, B, C>.to(that: D): Quartet<A, B, C, D> = Quartet(this.first, this.second, this.third, that)