package example

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")


}