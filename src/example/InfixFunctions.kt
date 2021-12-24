package example

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "horse" to "latte"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Latte" onto "is Horse"
    println(myPair)

    val sophia = Person("Sophia")
    val cludia = Person("Claudia")
    sophia likes cludia

}

class Person(val name : String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}
