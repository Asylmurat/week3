package com.example.a2
//pattern builder
fun main() {
    Builder1("Алекс").createHead()
    Builder2(2).createHand()
    Builder3(2).createLeg()
}
class Builder1(val name: String) {
    fun createHead() {
        println("[]")
    }
}
class Builder2(val hand: Int) {
    fun createHand() {
        if (hand == 2) {
            println("-|-")
        } else if (hand == 1) {
            println("-  ")
        } else {
            println("Нет")
        }
    }
}
class Builder3(val leg: Int) {
    fun createLeg() {
        if (leg == 2) {
            println("||")
        } else if (leg == 1) {
            println("|  ")
        } else {
            println("Нет")
        }
    }
}