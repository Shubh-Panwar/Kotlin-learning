package com.programming.practice

fun main() {
    println("Hello , Enter your age, please...")
    var age = readln().toInt()



    if (age >= 18 && age < 40) {
        println("you are welcome")

    } else if (age >= 40) {
            println("you are too old")
        } else {
            println("You are not welcome")


        }


}