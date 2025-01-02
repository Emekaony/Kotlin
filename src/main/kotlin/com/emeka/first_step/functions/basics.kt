package main.kotlin.com.emeka.first_step.functions

fun basics() {
    // parse this string and print the numbers
    val message = """
        apple, 200
        google, 450
        amazon, 455
    """.trimIndent()

    // define a lambda to handle this for us
    val extractNumber: (String) -> Int = { it.split(",")[1].trim().toInt() }

    // now use this lambda on message
    message.lines().map(extractNumber).forEach { println(it) } // the only way to get better is to keep at it
}