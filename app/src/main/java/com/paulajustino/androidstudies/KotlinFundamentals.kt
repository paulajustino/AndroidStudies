package com.paulajustino.androidstudies

class KotlinFundamentals

fun main() {
    var mutableInt: Int = 6
    mutableInt = 5
    println(mutableInt)

    val immutableInt: Int = 6
    /* immutableInt = 7
        nao é possivel alterar o valor da variavel imutavel
        exception: "val cannot be reassigned"
     */
    println(immutableInt)

    fun verifyIfIsEvenOrOdd(number: Int) {
/*        if (number % 2 == 0) {
            println("O número é par.")
        } else {
            println("O número é impar.")
        }*/

        when {
            number % 2 == 0 -> println("O número $number é par.")
            else -> println("O número $number é impar.")
        }
    }

    verifyIfIsEvenOrOdd(number = 14)
    verifyIfIsEvenOrOdd(number = 35)

    val array = IntArray(40)
    for (i in 0.. array.size-2) {
        array[i] = i + 1
        println(array[i])
    }

    val intList: MutableList<Int> = mutableListOf()
    for(i in 1.. 99) {
        intList.add(i)
        println(intList[i-1])
    }

    var soma: Int = 0
    for (item in intList) {
        soma += item
    }
    println(soma)
}