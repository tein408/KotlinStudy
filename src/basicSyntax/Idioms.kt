package basicSyntax

import java.lang.IllegalStateException


fun main() {

    val list = listOf("A", "B", "C")
    val map = mapOf("a" to 1, "b" to 2 ,"c" to 3)

    //access a map entry
    println(map["key"])
    //map["key"] = value

    for((k, v) in map) {
        println("$k -> $v")
    }

    //iterate over a range
//    for (i in 1..100) { ... }  // closed range: includes 100
//    for (i in 1 until 100) { ... } // half-open range: does not include 100
//    for (x in 2..10 step 2) { ... }
//    for (x in 10 downTo 1) { ... }
//    (1..10).forEach { ... }

   //if not null
    println(list?.size)

    //if not null else
    println(list?.size ?: "empty")
    // ?. ?: 붙여 쓰는게 문법
    //println(list? .size ? : "empty") -> 문법에 맞지 않음

    val l = list ?. size ?: -1
    println("list size is $l")

    println(map["mango"] ?: "mango is missing!")

    //val mapped = value?.let { transformValue(it) } ?: defaultValue

//  inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)
    //같은 표현
//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...

    //swap
    var a = 1
    var b = 2
    a = b.also {b = a}



}