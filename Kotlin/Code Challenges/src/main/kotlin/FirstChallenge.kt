/*You must do the reading of 5 integer values.
After show how many of them are even, odd, positive and negative.

Entry:
You will receive 5 integer values.
Exit:
Show a message following the example bellow, being one message per line.*/

fun main(args: Array<String>) {

    val integerss = mutableListOf<Int>()
    val even = mutableListOf<Int>()
    val odd = mutableListOf<Int>()
    val positive = mutableListOf<Int>()
    val negative = mutableListOf<Int>()

    for (i in 1..5) { integerss.add(readLine()!!.toInt()) }
    for (i in integerss) { if (i % 2 == 0) { even.add(i) } }
    for (i in integerss) { if (i % 2 != 0) { odd.add(i) } }
    for (i in integerss) { if (i > 0) { positive.add(i) } }
    for (i in integerss) { if (i < 0) { negative.add(i) } }

    println("${even.size} even value(s)")
    println("${odd.size} odd value(s)")
    println("${positive.size} positive value(s)")
    println("${negative.size} negative value(s)")

}