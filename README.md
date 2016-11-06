# Guild

Simple java tuples.

guild offers you tuple classes from two to four elements.

* [Pair](https://github.com/operando/Guild/blob/master/guild/src/main/java/com/os/operando/guild/Pair.java)
 * A tuple of two elements.
* [Triplet](https://github.com/operando/Guild/blob/master/guild/src/main/java/com/os/operando/guild/Triplet.java)
 * A tuple of three elements.
* [Quartet](https://github.com/operando/Guild/blob/master/guild/src/main/java/com/os/operando/guild/Quartet.java)
 * A tuple of four elements.

## How to use

### Pair

```java
Pair<String, Integer> pair = Pair.create("pair", 0);
System.out.println(pair.getFirst());
System.out.println(pair.getSecond());
```

### Triplet

```java
Triplet<String, Integer, Boolean> triplet = Triplet.create("triplet", 0, false);
System.out.println(triplet.getFirst());
System.out.println(triplet.getSecond());
System.out.println(triplet.getThread());
```

### Quartet

```java
Quartet<String, Integer, Boolean, LocalDate> quartet = Quartet.create("triplet", 0, false, LocalDate.now());
System.out.println(quartet.getFirst());
System.out.println(quartet.getSecond());
System.out.println(quartet.getThread());
System.out.println(quartet.getFourth());
```