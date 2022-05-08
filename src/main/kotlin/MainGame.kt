var HEALTH = 0
var POWER = 0
var COUNTOFKILLEDMONSTERS = 0
fun main() {
    welcome()
    healthOfKnight()
    powerOfKnight()
    println("Ваше здоровье : $HEALTH")
    println("Ваше здоровье : $POWER")
    generatorOfEvents()
}


fun welcome(){
    println("Привет! Это игра рыцарь и монстры, твоя цель в этой игре победить 10 монстров и остаться в живых. Колличество твоих здоровья и сил определяется рандомно, в ходе игры их можно будет увеличивать. Для принятия решений используй кнопки 1 и 2. Удачи!")
}

fun healthOfKnight(){
    val hp = (10..20).random()
    HEALTH = hp
}

fun powerOfKnight(){
    val pp = (10..20).random()
    POWER = pp
}

fun generatorOfEvents() {
    val events = arrayOf("Fight", "Apple", "Sword")
    val result = (1..events.size).random()

    if (result == 1) {
        //method Fight
    } else if (result == 2) {
        //method Apple
    } else {
        getSword()
    }
}

fun getSword() {
    val swordPower = (5..15).random()
    var isUserChoiceNotCorrect = true
    println("...Ты находишь на своем пути меч! Его сила равна: $swordPower")
    println("Хочешь взять этот меч? Введи '1' - чтобы заменить меч на новый. Введи '2' - чтобы пройти мимо")
    while (isUserChoiceNotCorrect) {
        val userChoice = readLine()
        if (userChoice != null) {
            if (userChoice == "1") {
                isUserChoiceNotCorrect = false
                POWER = swordPower
            } else if (userChoice == "2") {
                isUserChoiceNotCorrect = false
            } else {
                println("Введенно неправильное значение!")
            }
        } else {
            println("Ты ничего не ввел!")
        }
    }
}