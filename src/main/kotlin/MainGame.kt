import kotlin.random.Random

var HEALTH = 0
var POWER = 0
var COUNTOFKILLEDMONSTERS = 0
fun main() {
    welcome()
    healthOfKnight()
    powerOfKnight()
    println("Ваше здоровье : $HEALTH")
    println("Ваше здоровье : $POWER")
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