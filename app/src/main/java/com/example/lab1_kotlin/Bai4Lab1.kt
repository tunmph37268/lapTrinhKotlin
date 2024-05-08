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

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
    println("Exame6: ")
    for(i in 0..3) {
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")
    println("Exame7: ")
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // so sánh cấu trúc
    println(authors === writers)  // so sánh tham chiếu
    println("Exame8: ")
    fun max(a: Int, b: Int) = if (a > b) a else b

    println("GTLN:"+max( 99, -42))
    println("Exame9: ")
    fun min(a: Int, b: Int) = if (a < b) a else b

    println("GTNN:"+min( 99, -42))
    println("Exame10: ")
    for (c in 'a'..'d') {
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    print(" ")
}
fun eatACake() = println("Tú No love")
fun bakeACake() = println("Tú có Ny")
fun cases(obj: Any) {
    when (obj) {
        1 -> println("Tú")
        "Hello" -> println("GoodNight")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Không tồn tại")
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