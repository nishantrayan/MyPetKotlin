package KotlinSamples.Inheritance

open class Person(var name: String) {
    open fun talk() {
        println("Hi, I am $name")
    }
}

class Manager(name: String, var subordinates: List<Person>) : Person(name) {
    override fun talk() {
        println("I am $name and I have ${subordinates.size} subordinates and they are ${subordinates.map({ it.name })}")
    }
}

fun main(args: Array<String>) {
    var john = Person("Name1")
    john.talk()

    var boss = Manager("Alfred", listOf(john))
    boss.talk()
}