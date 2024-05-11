package com.example.lab3_kot104

fun main(){
 val soA=100
 var soB=10
 //scope
 with(soB){
  soB =this.inc()
  println("So B: $soB")
 }
 val luythu3=soB.let{
  val kq=it*it*it
  kq
 }
 val titile:String?="NMT_104"
 val length=titile?.run{
  if ( isEmpty()){
  0
 }
  else{
   length
  }
 }
 println(luythu3)
 println("Sum $soA and $soB:${sum(soA, soB)}")
 println("Tich $soA and $soB:${phepNhan(soA, soB)}")
 println("Luy thua $soB:${lutThua(soB)}")
 println("Thuong $soA and $soB:${phepChia(soA.toFloat(), soB.toFloat())()}")
 println("Do dai chuoi la:$length")
}
val sum={soA:Int,soB:Int->(soA+soB)}
val lutThua:(Int)->Int={it*it}
val phepNhan:(Int,Int)->Int={soA:Int,soB:Int->(soA*soB)}
val phepChia={soA:Float,soB:Float->{
 if (soB == 0f){
  "SBC # 0"
 }else{
  val kq=soA/soB
  kq
 }
}}
class Day3 {
}