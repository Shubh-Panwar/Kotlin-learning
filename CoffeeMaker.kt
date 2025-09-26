package com.programming.practice

fun main(){
    println("Who this coffee is for? Please enter name")
    val name=readln()
    println("How many pieces of Sugar do you want")
    val sugarCount =readln()
    val sugarCountInt= sugarCount.toInt()

    makeCoffee(sugarCountInt,name)

}

fun makeCoffee(sugarCount: Int, name:String){
    if (sugarCount ==1) {
        println("Here is $name's Coffee with $sugarCount spoon of sugar")
    }
    else {
        println("Here is $name's Coffee with $sugarCount spoons of sugar")
    }

}