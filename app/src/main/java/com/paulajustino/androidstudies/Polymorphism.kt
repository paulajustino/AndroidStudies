package com.paulajustino.androidstudies

class Polymorphism

abstract class Vehicle {
    private var velocity: Long = 0
    abstract var acceleration: Long
    abstract var model: String

    fun increaseVelocity() {
        this.velocity = this.velocity + this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity = this.velocity - this.acceleration
        if (this.velocity < 0)
            this.velocity = 0
    }

    fun getActualVelocity() = this.velocity

    override fun toString() : String {
        return "model = $model \n" +
                "velocity = $velocity \n" +
                "acceleration = $acceleration \n"
    }
}

class Car(
    override var acceleration: Long,
    override var model: String,
) : Vehicle()

class Motorcycle(
    override var acceleration: Long = 5,
    override var model: String,
) : Vehicle()

fun main() {
    val car: Car = Car(acceleration = 1, model = "audi A3")
    val moto: Motorcycle = Motorcycle(model = "honda 160")

    println(car.getActualVelocity())
    repeat (2) {
        car.increaseVelocity()
    }
    println(car)

    println(moto.getActualVelocity())
    repeat(3) {
        moto.decreaseVelocity()
    }
    println(moto)
}
