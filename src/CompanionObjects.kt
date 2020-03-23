package KotlinSamples.CompanionObjects

interface IFactory<T> {
    fun create(): T
}

data class Point(var x: Double, var y: Double) {
    companion object : IFactory<Point> {
        override fun create(): Point {
            return Point(0.0, 0.0)
        }

        fun createCartesian(x: Double, y: Double): Point = Point(x, y)
        fun createPolar(x: Double, y: Double): Point = Point(x, y)

    }
}

fun main(args: Array<String>) {
    var simplePoint = Point(1.0, 2.0)

//    var factoryPoint = Point.Factory.createCartesian(3.0, Math.PI / 2)
    val newPoint = Point.create()
    val newDefaultPoint = Point.Companion.create()

    println(newPoint)

}