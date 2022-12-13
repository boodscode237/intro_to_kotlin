import java.util.Arrays
import java.util.*

fun main() {
    var welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }
    var fish = 5;
    var plants = 14;
    val swarn = listOf(fish, plants)

    val bigSwarn = arrayOf(swarn, arrayOf("dolphin", "whale", "dogs"))
    println(bigSwarn.contentToString());
    val array = Array(5){it * 3}
    println(array.asList())
    for (element in bigSwarn) println(element)
    for ((index, element) in swarn.withIndex()){
        println("Fish at $index is $element")
    }

    for (i in 1..5) println(i)
    for (i in 5 downTo 1) println(i)
    for (i in 5 downTo 1 step 2) println(i)
}