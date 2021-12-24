package example

fun main() {
    fun printAll(vararg messages: String) {
        for(m in messages)
            println(m)
    }
    printAll("hello", "latte", "is", "horse")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for(m in messages)
            println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Latte", "Is", "Hores",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }

}