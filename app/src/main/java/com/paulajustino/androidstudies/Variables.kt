package com.paulajustino.androidstudies

class Variables

fun main() {
    var mutableInt: Int = 5
    val immutableInt: Int = 10

    println(mutableInt)
    mutableInt = immutableInt
    println(mutableInt)

    /*immutableInt = mutableInt -> operação nao é permitida
        val de tipo primitivo guarda o valor e nao da pra alterar
     */

    data class Money(var value: Int)

    var mutableMoney: Money = Money(40)
    println(mutableMoney)

    mutableMoney.value += 30
    println(mutableMoney)

    mutableMoney = Money(90)
    println(mutableMoney)

    val immutableMoney: Money = Money(100)
    println(immutableMoney)

    immutableMoney.value += 50
    println(immutableMoney)

    /*immutableMoney = Money(50) -> operação nao permitida
    val de tipo objeto guarda a REFERENCIA dele
    é possivel alterar valores dentro do objeto, mas sua referencia nao
 */
}