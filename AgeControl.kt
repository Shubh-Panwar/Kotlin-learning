package com.programming.practice

//basic age verification

fun main(){

    println("Please enter your age")

    val enteredvalue=readln()
    val age=enteredvalue.toInt()

    if (age in 18..<40) {
        println("Welcome, You can enter into the Club.")
    }   else if (age>=40) {
        println("Your are too old, Please go home")

    } else {
        println("You are under-aged")
    }

}