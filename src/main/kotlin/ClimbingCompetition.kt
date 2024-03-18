import kotlin.math.absoluteValue
import kotlin.math.ceil

fun climbingCompetition() {
    // val array = floatArrayOf(5f, 4.2f, 3f, 3.5f, 6f, 4f, 6f, 8f, 1f)
    // val array = floatArrayOf(0f, 1f, 2.5f, 0.8f)

    print("Enter number of obstacles: ")
    val count = readln().toInt()
    val array = FloatArray(count)
    println("Enter values: ")
    for (i in 0 until count) {
        array[i] = readln().toFloat()
    }
    print("Enter stamina: ")
    val stamina = readln().toInt()
    println(calculateObstacles(array, stamina))
}

private fun calculateObstacles(obstacles: FloatArray, stamina: Int): Int {
    var count = 0
    var currentStamina = stamina

    var previousIndex = 0
    var nextIndex = 1

    while (currentStamina > 0) {
        val previous = obstacles[previousIndex]
        val next = obstacles[nextIndex]

        val shouldGoUp = previous < next
        val gap = ceil((previous - next).absoluteValue.toDouble()).toInt()

        if (shouldGoUp) {
            currentStamina -= gap * 2
        } else {
            currentStamina -= gap * 1
        }

        if (currentStamina >= 0) {
            count++
        }

        previousIndex++
        nextIndex++
    }

    return count
}