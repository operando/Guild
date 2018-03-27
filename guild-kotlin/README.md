# Guild_kt

Kotlin tuples.

Guild offers you tuple classes from four to nine elements.

Pair and Triplet use kotlin standard library.

* [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)
  * kotlin-stdlib
* [Triplet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)
  * kotlin-stdlib
* [Quartet](https://github.com/operando/Guild/tree/master/guild-kotlin/src/main/kotlin/com/os/operando/guild/kt/Quartet.kt)
  * A tuple of four elements.
* [Quintet](https://github.com/operando/Guild/tree/master/guild-kotlin/src/main/kotlin/com/os/operando/guild/kt/Quintet.kt)
  * A tuple of five elements.
* [Sextet](https://github.com/operando/Guild/tree/master/guild-kotlin/src/main/kotlin/com/os/operando/guild/kt/Sextet.kt)
  * A tuple of six elements.
* [Septet](https://github.com/operando/Guild/tree/master/guild-kotlin/src/main/kotlin/com/os/operando/guild/kt/Septet.kt)
  * A tuple of seven elements.
* [Octet](https://github.com/operando/Guild/tree/master/guild-kotlin/src/main/kotlin/com/os/operando/guild/kt/Octet.kt)
  * A tuple of eight elements.
* [Ennead](https://github.com/operando/Guild/tree/master/guild-kotlin/src/main/kotlin/com/os/operando/guild/kt/Ennead.kt)
  * A tuple of nine elements.

## Download

[![Download](https://api.bintray.com/packages/operandoos/maven/guild_kt/images/download.svg?version=1.0.0) ](https://bintray.com/operandoos/maven/guild_kt/1.0.0/link) or grab via Gradle:

```gradle
compile 'com.os.operando.guild.kt:guild_kt:1.0.0'
```

or Maven:

```
<dependency>
  <groupId>com.os.operando.guild.kt</groupId>
  <artifactId>guild_kt</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## How to use

### Triplet

```kotlin
val triple = 1 to 10L to "triple"
println(triple.first)
println(triple.second)
println(triple.third)
```

### Quartet

```kotlin
val quartet = 1 to 10L to true to "quartet"
println(quartet.first)
println(quartet.second)
println(quartet.third)
println(quartet.fourth)
```

### Quintet

```kotlin
val quintet = 1 to 10L to true to LocalDateTime.now() to "quintet"
println(quintet.first)
println(quintet.second)
println(quintet.third)
println(quintet.fourth)
println(quintet.five)
```

### Sextet

```kotlin
val sextet = 1 to 10L to true to LocalDateTime.now() to "sextet" to listOf("sextet")
println(sextet.first)
println(sextet.second)
println(sextet.third)
println(sextet.fourth)
println(sextet.five)
println(sextet.six)
```

### Septet

```kotlin
val septet = 1 to 10L to true to LocalDateTime.now() to "septet" to listOf("septet") to Long.MAX_VALUE
println(septet.first)
println(septet.second)
println(septet.third)
println(septet.fourth)
println(septet.five)
println(septet.six)
println(septet.seven)
```

### Octet

```kotlin
val qctet = 1 to 10L to true to LocalDateTime.now() to "septet" to listOf("septet") to Long.MAX_VALUE to 1.0
println(qctet.first)
println(qctet.second)
println(qctet.third)
println(qctet.fourth)
println(qctet.five)
println(qctet.six)
println(qctet.seven)
println(qctet.eight)
```

### Ennead

```kotlin
val ennead = 1 to 10L to true to LocalDateTime.now() to "septet" to listOf("septet") to Long.MAX_VALUE to 1.0 to UUID.randomUUID()
println(ennead.first)
println(ennead.second)
println(ennead.third)
println(ennead.fourth)
println(ennead.five)
println(ennead.six)
println(ennead.seven)
println(ennead.eight)
println(ennead.nine)
```

### License

```
Apache Version 2.0

Copyright (C) 2018 Shinobu Okano

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
