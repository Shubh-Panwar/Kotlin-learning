package com.programming.practice


fun main(){

    var computerChoice = ""
    var playerChoice = ""

    println("Rock,Paper or Scissors,Enter your choice!")

    playerChoice = readln()
    val randomNumber= (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice="Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3    -> {
            computerChoice ="Scissors"}
    }

    val Winner = when{

        computerChoice==playerChoice -> "Tie"

        computerChoice=="Rock" && playerChoice=="Paper" -> "Player Won"

        computerChoice=="Paper" && playerChoice=="Scissors" -> "Player Won"

        computerChoice=="Scissors" && playerChoice=="Rock" -> "Player Won"

       else -> "Computer Won"

    }

    println("The computer Chose " +computerChoice)

    println("Winner of the Game = "+Winner)


}