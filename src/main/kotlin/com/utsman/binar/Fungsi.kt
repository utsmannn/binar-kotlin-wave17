package com.utsman.binar

// top level function
fun something() {
    println("ini top level function")

    fun anuan() {
    }

    anuan()
}

class Car {
    // member function
    fun something() {
        println("ini member function")
        // nested function

        fun nestedSomething() {
            println("ini nested function")

        }

        nestedSomething()
    }
}

object CarObject {
    fun something() {

    }
}

fun main(args: Array<String>) {
    something()

    val car = Car()
    car.something()

    CarObject.something()

}