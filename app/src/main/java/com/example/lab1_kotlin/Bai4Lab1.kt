package com.example.lab1_kotlin
fun main( args:Array<String>) {
    println("Exame1: ")
    println(whenAssign("Hello"))
    println(whenAssign(1))
    println(whenAssign(Bai4Lab1()))
    println("Exame2: ")
    cases("Hello")
    cases(1)
    cases("ggg")
    println("Exame3: ")
    val cakes = listOf("Minh Tú", "Thầy Duy")
    for (cake in cakes) {
        println("Yummy, $cake very handsome!")
    }
    println("Exame4: ")
    var one = 0
    var two = 0
    while (one < 2) {
        eatACake()
        one ++
    }
    do {
        bakeACake()
        two++
    } while (two < one)
    println("Exame5: ")
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}
fun eatACake() = println("Tú No love")
fun bakeACake() = println("Tú có Ny")
fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("Tú")                          // 2
        "Hello" -> println("GoodNight")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Không tồn tại")                   // 6
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}
class Bai4Lab1 {
}