package com.paulajustino.androidstudies

class Classes

class OldVehicle(
    private var velocity: Long = 0,
    private var acceleration: Long = 10,
    var model: String
) {
    fun increaseVelocity() {
        this.velocity = this.velocity + this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity = this.velocity - this.acceleration
        if (this.velocity < 0)
            this.velocity = 0
    }

    fun getActualVelocity() = this.velocity
}

fun main() {
    val vehicle1: OldVehicle = OldVehicle(velocity = 60, model = "fiat mobi")
    val vehicle2: OldVehicle = OldVehicle(velocity = 80, acceleration = 20, model = "audi A3")

    println(vehicle1.model)
    println(vehicle1.getActualVelocity())

    repeat(7) {
        vehicle1.decreaseVelocity()
    }

    println(vehicle1.getActualVelocity())

    println(vehicle2.model)
    println(vehicle2.getActualVelocity())

    repeat(2) {
        vehicle2.increaseVelocity()
    }

    println(vehicle2.getActualVelocity())
}
