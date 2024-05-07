package com.example.lab1_kotlin
fun main(){
    println("Helo Fpoly-Kotlin")
    val a:Int=2
    val b=2
    var c=(a+b)/2
    val mess :String="Sum $a va $b la: $c"
    println(mess)
    val soA=3
    val soB=5f
    val kq= phepChia(soA,soB)
    println(kq)
    val arrX= intArrayOf(1,2,3,4,5)
    val arrY= arrayOf(1.5f,"d",4)
    println("""Gia tri X 2:${arrX[1]}|Gia tri Y 3:${arrY[2]}""".trimMargin())
}
fun phepChia(soA:Int,soB:Float):String{
    if (soB==0f){
        return "so B ko dc bang 0"
    }
    val thuong=soA/soB
    return "Thương 2 so:$thuong"
}
class Day1 {
}