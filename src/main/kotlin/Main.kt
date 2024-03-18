import kotlin.system.exitProcess

val Problems = mapOf(
    "0. Exit" to ::exit,
    "1. Pentagonal Number" to ::pentagonalNumber,
    "2. Bulb Switcher" to ::bulbSwitcher,
    "3. Type of Triangle" to ::typeOfTriangle,
    "4. Climbing Competition" to ::climbingCompetition,
    "5. Copy Past Problem" to ::copyPasteProblem
)

fun main() {
    while (true) {
        println("#ITEC 2K24 Code Clash Problems")
        Problems.keys.forEach(::println)
        print("Enter problem number: ")
        val input = readln().toInt()
        if (input in Problems.keys.indices) {
            val key = Problems.keys.elementAt(input)
            Problems[key]!!.invoke()
        } else {
            println("Invalid input")
            return
        }
    }
}

fun exit() {
    exitProcess(1)
}