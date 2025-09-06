package com.programming.practice

//basic age verification

fun main(){

    println("Please enter your age")

    val enteredvalue=readln()
    val age=enteredvalue.toInt()

    if (age<18){
        println("you are not welcome here")
    }else
        println("You can Enter here")


}