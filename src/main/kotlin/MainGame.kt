

var HEALTH = 1
var POWER = 1
var COUNTOFKILLEDMONSTERS = 0

fun main() {
    welcome()
    healthOfKnight()
    powerOfKnight()
    while (COUNTOFKILLEDMONSTERS < 10 && HEALTH > 0) {
        println("Ваше здоровье : $HEALTH")
        println("Ваша сила : $POWER")
        generatorOfEvents()
    }
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


fun meetingWithMonster() {
    var monsterPower = createHealthOfMonster()
    var monsterHealth = createPowerOfMonster()
    userChoice(monsterPower, monsterHealth)
}

fun createHealthOfMonster():Int {
    var hpOfMonster = (10..20).random()
    println("Здоровье монстра: $hpOfMonster")
    return hpOfMonster
}

fun createPowerOfMonster():Int {
    var ppOfMonster = (10..20).random()
    println("Сила монстра: $ppOfMonster")
    return ppOfMonster
}

fun userChoice(monsterPower: Int, monsterHealth: Int) {
    println("Вы можете атаковать монста (нажмите 1) или убежать (нажмите 2)")
    val knightInput = readLine()
    var monsterHP = monsterHealth
    var monsterPP = monsterPower
    if (knightInput != null) {
        if (knightInput == "1") {
            while (HEALTH > 0 && monsterHP > 0){
                HEALTH -= monsterPower
                if (HEALTH > 0) {
                    monsterHP -= POWER
                    if (monsterHP <= 0) {
                        COUNTOFKILLEDMONSTERS += 1
                        println("Молодец, ты победил! Ваше здоровье: $HEALTH. Убитых монстров: $COUNTOFKILLEDMONSTERS.")
                    }
                } else {
                    println("вы умерли")
                }
            }
        } else if (knightInput == "2") {
            println("Вы убежали. Ваше здоровье: $HEALTH. Убитых монстров: $COUNTOFKILLEDMONSTERS.")
        } else {
            println("Попробуй ещё раз")
        }
    }
}

fun getAnApple(): Int {
    var bonus = (10..15).random()
    HEALTH += bonus
    println("Поздравляю! Ты нашёл яблочко, которое дарует тебе силу. Ваше здоровье: $HEALTH")
    return HEALTH
}

fun generatorOfEvents() {
    val events = arrayOf("Fight", "Apple", "Sword")
    val result = (1..events.size).random()

    if (result == 1) {
        meetingWithMonster()
    } else if (result == 2) {
        getAnApple()
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