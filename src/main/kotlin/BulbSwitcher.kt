fun bulbSwitcher() {
    print("Enter number of bulbs: ")
    val input = readln().toInt()
    // println(sqrt(input.toDouble()).toInt())
    println(countBulbs(input))
}

fun countBulbs(n: Int): Int {
    val array = IntArray(n) { 1 }

    for (i in 1 until n) {
        var index = i
        while (index < n) {
            array[index] = if (array[index] == 0) 1 else 0
            index += i.inc()
        }
    }

    return array.count { it == 1 }
}