package KotlinSamples.Interfaces

interface ISomething {
    fun doThings()

    val name: String get() = "Something"
    val age: Int
    var foo: String
}

class Concrete(override var foo: String) : ISomething {
    override val age: Int
        get() = 12

    override fun doThings() {

    }
}

fun main() {
    var c: ISomething = Concrete("blah")
    c.doThings()

    println(c.name)
}