package KotlinSamples.Classes

class Person {
    val canVote: Boolean get() = age >= 16
    lateinit var name: String
    var age: Int = -1
    var ssn = "0000000"
        get() = field
        set(value) {
            println(("$name's SSN changes "))
            field = value
        }
}

fun main(args: Array<String>) {
//    val me = Person()
//    me.name = "Nishant"
//    me.age = 20
//    println("${me.name} can${if(!me.canVote) "not" else ""} vote")
//    me.ssn = "12345"
    val me = Human("Nishant", 54)
    println(me)

    val h2 = Human(name = "Nishant", age = 54)
    println(h2 == me)

    val h3 = h2.copy()
    println(me == h3)

    val (name, age) = h2
    println("$name and age is $age")

    var point = PointFactory.NewPolarPoint(3.0, Math.PI/2)
    println(point)

}

object PointFactory {
    fun NewCartesianPoint(x: Double, y: Double): Point = Point(x, y)
    fun NewPolarPoint(rho: Double, theta: Double): Point = Point(rho * Math.cos(theta), rho * Math.sin(theta))
}

data class Point(var x: Double, var y: Double)
data class Human(var name: String, val age: Int) {
    init {
        println("Human is initied with $name and $age")
    }

    override fun toString(): String {
        return "name is $name and age is $age"
    }
}
