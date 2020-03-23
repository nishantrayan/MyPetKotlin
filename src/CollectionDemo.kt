package KotlinSamples.CollectionDemo

import java.lang.Math.pow

fun main(args: Array<String>) {
    val seq = generateSequence(1, { it + 1 })
    val numbers = seq.take(10)
    println(numbers.toList())

    val nums = arrayOf(1, 2, 3).asSequence()
    println("Are all numbers > 0 ${nums.all { it > 0 }}")
    println("Are all numbers > 0 ${nums.all { it > 0 }}")
    println("Are all odd > 0 ${nums.all { it % 2 == 1 }}")
    println("Are all odd > 1 ${nums.all { it > 1 }}")
    println(emptyArray<Int>().any())
    println("Contains 5? ${nums.contains(5)}")
    println("# of elements > 3 ${nums.count { it > 3 }}")

    val nums2 = seq.take(4)

    val squares = nums2.map { it * it }

    println(squares.toList())

    val sentence = "This is a nice sentence"
    val wordLengths = sentence.split(" ").map { it.length }.asSequence()
    println(wordLengths.toList())

    val wordsWithLength = sentence.split(" ").map {
        object {
            val length = it.length
            val word = it
        }
    }

    for (wl in wordsWithLength) {
        println("${wl.word} has length ${wl.length}")
    }

    val wordLengthPairs = sentence.split(" ").associate { it.to(it.length) }

    for (wl in wordLengthPairs)
        println(wl)

    val sequences = listOf("red,gree,blue", "orange", "white,pink")
    val allWords = sequences.flatMap { it.split(",") }
    println(allWords.toList())

    val objects = arrayOf("house", "car", "bicycle")
    val colors = arrayOf("red", "green")

    val pairs = objects.flatMap { o -> colors.map { c -> "$c $o" } }
    println(pairs.toList())

    val seqNums = generateSequence(1, { it + 1 }).take(10).toList()
    println(seqNums)

    println(seqNums.joinToString(" -> "))
    println("sum (reduce) = ${seqNums.reduce { x, y -> x + y }}")
    println("\n product (reduce) = ${seqNums.reduceRight { x, y ->
        println("( $x * $y ) ")
        x * y
    }
    }")
    println("sum = ${seqNums.sum()} and average=${seqNums.average()}")

    println("Sum of squares == ${seqNums.sumBy { it * it }}")
    println("Sum of roots == ${seqNums.sumByDouble { Math.sqrt(it.toDouble()) }}")

    println("sum (fold) = ${seqNums.fold(0, { x, y -> x + y })}")
    println("product (fold) = ${seqNums.fold(1, { x, y -> x * y })}")

    var three = seq.take(3)

    println("poly = ${three.foldIndexed(0, { i, p, c ->
        var xp = pow(3.0, (2 - i).toDouble()).toInt()
        println("i = $i xp = $xp c = $c")
        c * xp + i
    })}")
}