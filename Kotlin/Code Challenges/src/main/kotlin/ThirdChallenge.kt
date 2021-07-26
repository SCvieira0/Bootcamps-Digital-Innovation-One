/*
Entry:
The entry consists of only one line that have two integers H and P (1 ≤ H, P ≤ 1000)
respectively indicating the total number of participants in the competition.
Exit:
Your program must produce only one line with the rational number
representing the average number of Brazilian fried chicken balls
consumed by the participants.
The result must be written with a rational number
with exactly two digits after the decimal
point, and rounded if necessary.*/

import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val H: Double = reader.nextDouble()
    val P: Double = reader.nextDouble()

    if(H >= 1 && P <= 1000){
        val average: Double = H / P
        println(String.format("%.2f", average))
        reader.close()
    }
}