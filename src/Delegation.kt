package kotlinSamples.Delegation

import kotlin.properties.Delegates

class Person {
    val lazyvar: String by lazy {
        println("Lazy inited")
        "test"
    }

    var otherName: String by Delegates.observable("Jack") { prop, old, new ->
        println("Changed from $old to $new")
    }
}

fun main(args: Array<String>) {
    val me = Person()
    me.otherName = "Jill"
    me.otherName = "Nishant Rayan"
    println(me.otherName)

    println(me.lazyvar)
    println(me.lazyvar)
}