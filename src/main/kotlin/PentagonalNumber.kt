fun pentagonalNumber() {
    val input = readln()
    println(calculateDots(input.toInt()))
}

private fun calculateDots(n: Int): Int {
    var count = 1

    for (i in 0 until n) {
        count += 5 * i
    }

    return count
}