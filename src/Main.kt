fun main() {
    // introduction
    println("HELLO THERE TRAVELERS")
    println()
    println("It appears you both have a problem with each other and will settle it in battle")
    println()
    var player1 = getString("Player 1, enter your name: ")
    println()
    var player2 = getString("Player 2, enter your name: ")
    println()
    println("$player1 choose your fighting style")
    while (true) {
        val gear1 = fightClass()
        when (gear1) {
            'Q'->break
            'K'->

        }

    }

}

/**
 * Function to get a string from the user
 * parameters:
 * - prompt - text to show the user
 * returns:
 * - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}


fun fightClass(): Char {
    println("press [K] for Knight ")
    println("press [T] for Thief")
    println("press [B] for Barbarian")
    println("press [H] for Healer")
    println("press [W] for Wizard")
    println("press [M] for Musician")
    println("press [A] for Archer")
    println("press [D] for Druid")
    println("press [R] for Religion")
    println("press [M] for Monk")
    println("press [E] for Evoker")
    println("press [Q] to Quit")

    val validChoices = "KTBHWMADRMEQ"

    while (true) {
        println("Choice: ")
        val input = readln()
        // typed nothing? try again
        if (input.isBlank()) continue
        // grab the first letter
        val choice = input.uppercase().first()

        // check for a valid option
        if (validChoices.contains(choice)) return choice
    }
}

fun knight(){
}