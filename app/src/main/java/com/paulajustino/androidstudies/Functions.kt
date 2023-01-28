package com.paulajustino.androidstudies

class Functions

fun main() {

    fun sum(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber+secondNumber
    }

    // funçoes compactas: pode-se omitir chaves e return
    fun multiplication(firstNumber: Int, secondNumber: Int) = firstNumber * secondNumber

    fun calculator(firstNumber: Int, secondNumber: Int, operation: (Int, Int) -> Int): Int {
        return operation(firstNumber, secondNumber)
    }

    println(calculator(firstNumber = 4, secondNumber = 6, ::sum))
    println(calculator(firstNumber = 4, secondNumber = 6, ::multiplication))

    val intList: MutableList<Int> = mutableListOf()
    for (i in 1..99) {
        intList.add(i)
    }

    val evenNumbers = intList.filter { number -> number % 2 == 0 }

    val namesList = listOf("Abayomi", "Bomani", "Chissomo", "Dandara")
    val greetingList = namesList.map {
            name -> "Olá $name"
    }.forEach {
        println(it)
    }
}
