package com.paulajustino.androidstudies

class SpecialClasses

// -------------------- Activity 1 --------------------
fun String.createACharListFromString(): MutableList<Char> {
    val charList: MutableList<Char> = mutableListOf()
    for(i in this) {
        charList.add(i)
    }
    return charList
}

// -------------------- Activity 2 --------------------
enum class DayOfWeek(val day: String) {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")
}

// -------------------- Activity 3 --------------------
object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(day: DayOfWeek) {
        this.currentDay = day
    }

    fun isWeekend(): Boolean {
        return when (this.currentDay) {
            DayOfWeek.SATURDAY, DayOfWeek.SUNDAY -> true
            else -> false
        }
    }
}

// -------------------- Activity 4 --------------------
class OtherClass {
    init {
        UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    }
}

fun main() {

    // -------------------- Activity 1 --------------------
    val stringTest = "android"
    val charList = stringTest.createACharListFromString()
    charList.forEach {
        println(it)
    }

    // -------------------- Activity 4 --------------------
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    println(UtilityHelper.isWeekend())
    val otherClass = OtherClass()
    println(UtilityHelper.isWeekend())
}
