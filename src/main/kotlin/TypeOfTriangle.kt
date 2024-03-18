fun typeOfTriangle() {
    println("Enter sides of triangle: ")
    val sides = IntArray(3)
    for (i in 0 until 3) {
        sides[i] = readln().toInt()
    }

    if (isATriangle(sides)) {
        println(findTypeOfTriangle(sides))
    } else {
        println("none")
    }
}

private fun findTypeOfTriangle(sides: IntArray): String = when {
    sides[0] == sides[1] && sides[1] == sides[2] -> "equilateral"
    sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2] -> "isosceles"
    else -> "scalene"
}

private fun isATriangle(sides: IntArray): Boolean {
    return (sides[0] + sides[1] > sides[2]) && (sides[1] + sides[2] > sides[0]) && (sides[0] + sides[2] > sides[1])
}