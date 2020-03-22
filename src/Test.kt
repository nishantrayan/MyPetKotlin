import KotlinSamples.Functions.*
fun main(args: Array<String>) {
//    var_declarations()
//    ranges()

//    arrays()
//    character_and_strings()
//    nullability()
//    if_statement()
//    flow_based_typing()
//    for_loop()
//    when_expression()
say_hello()
}

fun when_expression() {
    val code = 0
    when (code) {
        44 -> println("UK")
        46 -> println("Sweded")
        39, 379 -> println("Vatican")
        get_france_dialing_code() -> println("France")
        in 1..999 -> println("Unknown")
        else -> {
            println("Invalid")
        }
    }
    val z: Any = "foo"
    when (z) {
        is Int -> println("We got an int")
        is String -> println("Tex is " + z)
        else -> println("don't know")
    }
    val output = when {
        code > 0 -> "code is positive"
        code < 0 -> "code is negative"
        else -> "code is zero"
    }
    println(output)
}

fun get_france_dialing_code() = 33

fun for_loop() {
    for (a in (10 downTo 1)) print("$a\t")
    println()

    val ints = intArrayOf(4, 3, 2, 1)
    for ((index, value) in ints.withIndex()) {
        println("$index: \t $value")
    }

    val capitals = mapOf("Paris" to "France", "London" to "UK")
    for ((capital, country) in capitals) {
        println("$capital is the capital of $country")
    }
}

fun flow_based_typing() {
    var s: String? = "blah"
    if (s != null) {
        println(s.length)
    }

    var x: Cloneable = intArrayOf(1, 2, 3)
    if (x is IntArray) {
        print(x.size)
    }
}

fun if_statement() {
    // ?:
    val temp = 5
    val feel: String =
        if (temp < 10) {
            "cold"
        } else if (temp > 20) {
            "warm"
        } else {
            "ok"
        }
    println("it is ${if (temp > 20) "warm" else "ok"} today")
    println("it feels $feel outside")

}

fun nullability() {
    var y: String? = "foo"
//    val len = y?.length ?: -1
//    println(len)

    println(y!!.length)
}

fun character_and_strings() {
    val a: Char = '\u0041'
    if (a.toInt() == 65) {
        println("match")
    }

    var b: String = "Hello"
    println(b)
    println(b[0])
    for (letter in b) println(letter)

    var raw = """hello
        "something halle"
        """
    println(raw)

    val c = 123.0
    val d = "c = $c, price = ${'$'}${c / 10}"
    println(d)

    val e = "${(10 downTo 1).toList().map { it.toString().toCharArray().toList() }.joinToString()}"
    println(e)


}


fun arrays() {
    var names: Array<String> = arrayOf("Something", "somethingelse", "blue")
    names[0] = "a"
    println(names.toList())

    var ages = intArrayOf(44, 30, 29)
    println(ages.toList())

    val values = Array<Double>(10, { 2.0 })
    println(values.toList())
    var squares: Array<String> = Array(10, { (it * it).toString() })
    println(squares.toList())
}

fun ranges() {
//    val a: IntRange = 1..10
    val a: IntProgression = (1..10).reversed()
    for (x in a) println(x)
    println("Sum of ints $a = ${a.sum()}")
    var b: IntProgression = 10 downTo 1
    for (y in b) println(y)
    val m = 8
    val n = -3
    val c = IntRange(n, m)
    for (z in c) println(z)

    val d = 100 downTo 1 step 3
    for (x in d) print("$x \t")
    println()
}

fun var_declarations() {
    val a: Int = 64
    val b = 123
    val c = 2.3f
    val d = 12.3e5
    println("$a $b $c $d")
    val e: Int;
    e = 123

    val f: StringBuffer = StringBuffer("Something")
    f.replace(0, 1, "T")
    println(f)
    var g: Int = 123
    g = 45

}