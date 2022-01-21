package com.example.singleton
//pattern singleton
fun main() {
    println("Number1 + Number2 = ${Numberplusnumber.add(3,2)}")
}
object  Numberplusnumber {
    fun add(num1:Int,num2:Int):Int
    {
        return num1.plus(num2)
    }
}