package KotlinSamples.Classes
class Person {
    val canVote: Boolean get() = age >= 16
    lateinit var name:String
    var age:Int = -1
    var ssn = "0000000"
    get() = field
    set(value) {
        println(("$name's SSN changes "))
        field = value
    }
}

fun main(args:Array<String>) {
//    val me = Person()
//    me.name = "Nishant"
//    me.age = 20
//    println("${me.name} can${if(!me.canVote) "not" else ""} vote")
//    me.ssn = "12345"
    val me = Human("Nishant", 54)
    println(me.name)
}

class Human(var name:String, val age:Int)
{
    init {
        println("Human is initied with $name and $age")
    }
}
