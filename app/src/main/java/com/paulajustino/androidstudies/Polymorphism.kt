package com.paulajustino.androidstudies

class Polymorphism

// ------------------- Activity 1 -------------------
abstract class Vehicle1(
    open var model: String,
) {
    var velocity: Long = 0
    abstract var acceleration: Long

    fun increaseVelocity() {
        this.velocity = this.velocity + this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity = this.velocity - this.acceleration
        if (this.velocity < 0)
            this.velocity = 0
    }

    fun getActualVelocity() = this.velocity

    override fun toString(): String {
        return "model = $model \n" +
                "velocity = $velocity \n" +
                "acceleration = $acceleration \n"
    }

    abstract fun printVehicleVelocity(): String
}

class Car1(
    override var model: String
) : Vehicle1(model) {
    override var acceleration: Long = 2

    override fun printVehicleVelocity(): String {
        val velocity = super.getActualVelocity()
        return "velocity: $velocity of the vehicle: Car"
    }
}

class Motorcycle1(
    override var model: String
) : Vehicle1(model) {
    override var acceleration: Long = 5

    override fun printVehicleVelocity(): String {
        val velocity = super.getActualVelocity()
        return "velocity: $velocity of the vehicle: Motorcycle"
    }
}

// ------------------- Activity 2 -------------------
interface Vehicle2 {
    var velocity: Long
    var acceleration: Long
    var model: String

    fun increaseVelocity() {
        this.velocity = this.velocity + this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity = this.velocity - this.acceleration
        if (this.velocity < 0)
            this.velocity = 0
    }
}

class Car2(
    override var velocity: Long = 0,
    override var acceleration: Long,
    override var model: String
) : Vehicle2 {
    override fun toString(): String {
        return "model = $model \n" +
                "velocity = $velocity \n" +
                "acceleration = $acceleration \n"
    }
}

class Motorcycle2(
    override var velocity: Long = 0,
    override var acceleration: Long = 5,
    override var model: String
) : Vehicle2 {
    override fun toString(): String {
        return "model = $model \n" +
                "velocity = $velocity \n" +
                "acceleration = $acceleration \n"
    }
}

// ------------------- Activity 3 -------------------
class VehicleFactory {
    fun createAnVehicle(type: String, model: String = ""): Vehicle1? {
        return when (type) {
            "car" -> Car1(model)
            "moto" -> Motorcycle1(model)
            else -> null
        }
    }
}

fun main() {
    // ------------------- Activity 1 -------------------
    val car1 = Car1(model = "audi A3")
    val moto1 = Motorcycle1(model = "honda 160")

    car1.decreaseVelocity()
    println(car1)

    moto1.increaseVelocity()
    println(moto1)

    // ------------------- Activity 2 -------------------
    val car2 = Car2(acceleration = 2, model = "fusion")
    val moto2 = Motorcycle2(velocity = 10, model = "bmw gs")

    car2.decreaseVelocity()
    println(car2)

    moto2.increaseVelocity()
    println(moto2)

    // ------------------- Activity 3 -------------------
    val factory = VehicleFactory()

    val vehicleList: MutableList<Vehicle1> = mutableListOf()
    val vehicle1 = factory.createAnVehicle(type = "car", model = "audi A3")
    vehicle1?.let {
        vehicleList.add(vehicle1)
    }
    val vehicle2 = factory.createAnVehicle(type = "moto", model = "honda 160")
    vehicle2?.let {
        vehicleList.add(vehicle2)
    }
    val vehicle3 = factory.createAnVehicle("bike")
    vehicle3?.let {
        vehicleList.add(vehicle3)
    } // vehicle3 must be null

    vehicleList.forEach {
        it.increaseVelocity()
        println(it.printVehicleVelocity())
    }
}