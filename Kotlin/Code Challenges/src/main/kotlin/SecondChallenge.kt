/*
You must calculate the average consumption of an automobile where it will be informed
the total distance traveled (km) and the total of fuel consumed (in liters).

Entry:
You will receive two values: one integer X with the total distance traveled (in km),
and one value Y which will represent the total of fuel consumed,
with one digit after the decimal point.
Exit:
Show the value which represents the average consumption of the automobile
(3 digits after the decimal point),
including the message "km/l" at the end.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    val x: Int = reader.nextInt()
    val y: Float = reader.nextFloat()

    val average = x / y
    println(String.format("%.3f km/l", average))
    reader.close()
}