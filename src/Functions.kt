package KotlinSamples.Functions


fun say_hello(): Unit {
    println("say hello")
}

fun triple(x: Int) = x * 3

fun calculate_wages(hours_worked: Int = 160, hourly_rate: Double = 100.0): Double {
    return hourly_rate * hours_worked
}

fun sum_up(vararg values: Int) = values.sum()

fun solve_quadratic_equations(a: Double, b: Double, c: Double): Pair<Double, Double> {
    fun calculate_discriminate(): Double {
        return b * b - 4 * a * c
    }

    val root_disc = Math.sqrt(calculate_discriminate())
    return Pair((-b + root_disc) / (2 * a), (-b - root_disc) / (2 * a))
}

infix fun Double.averagedWith(other: Double): Double {
    return (this + other) / 2.0
}

fun infix_functions() {
    val x = 'z' downTo 'a'
    val capitals = mapOf("Paris" to "France", "London" to "UK")
    val a = 3.0
    val b = 10.0
    println("The average of $a and $b is ${a averagedWith b}")

}