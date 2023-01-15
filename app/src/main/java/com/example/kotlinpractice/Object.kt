package com.example.kotlinpractice

 object CarFactory{
     val cars = mutableListOf<Car>()
     fun makeCar(power:Int):Car{
         val car = Car(power)
         cars.add(car)
         return car
     }
 }

data class Car(val power: Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}