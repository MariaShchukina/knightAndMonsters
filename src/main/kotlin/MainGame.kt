
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

