fun copyPasteProblem() {
    val input = "the egg and Ctrl + C Ctrl + V the spoon"
    println(formatString(input))
}

fun formatString(input: String): String {
    val keywords = setOf("Ctrl + C", "Ctrl + V")

    var result = ""
    var previous = ""

    val words = input.split(" ")
    words.forEach(::println)

    return result
}