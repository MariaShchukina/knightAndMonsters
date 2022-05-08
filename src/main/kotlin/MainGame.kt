import kotlin.random.Random

fun main() {
    
}

fun generatorOfEvents() {
    val events = arrayOf("Fight", "Apple", "Sword")
    val result = Random.nextInt(0,events.size-1)

    if (result == 0) {
        //method Fight
    } else if (result == 1) {
        //method Apple
    } else {
        //method Sword
    }
}

fun getSword() {
    val swordPower = Random.nextInt(1,50)
    var isUserChoiceNotCorrect = true
    println("...Ты находишь на своем пути меч! Его сила равна: $swordPower")
    println("Хочешь взять этот меч? Введи '1' - чтобы заменить меч на новый. Введи '2' - чтобы пройти мимо")
    while (isUserChoiceNotCorrect) {
        val userChoice = readLine()
        if (userChoice != null) {
            if (userChoice.toInt() == 1) {
                isUserChoiceNotCorrect = false
                //POWER = powerSword
            } else if (userChoice.toInt() == 2) {
                isUserChoiceNotCorrect = false
            } else {
                println("Введенно неправильное значение!")
            }
        } else {
            println("Ты ничего не ввел!")
        }
    }
}