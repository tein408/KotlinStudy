package basicSyntax

fun main() {
    println(maxOf(0, 43))
    println(max2(3, 42))

    val items = listOf("apple", "banana", "kiwifruit")

    for(idx in items) {
        println(idx)
    }

    //iterate over a collection
    for(idx in items.indices) {
        println("item at $idx is ${items[idx]}")
    }

    println("===================================")

    var idx = 0
    while(idx < items.size) {
        println("item at $idx is ${items[idx]}")
        idx++
    }

    println("===================================")

    //when
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("===================================")

    val x = 10
    val y = 9
    if(x in 1..y+1)
        println("fits in range")

    println("===================================")

    //listOf 출력
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    println("===================================")

    //1~5 순서대로 출력
    for (x in 1..5) {
        print(x)
    }

    println()

    //2씩 증가
    for (x in 1..10 step 2) {
        print(x)
    }

    println()

    //3씩 증가
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    println("\n===================================")

    //setOf 안에 있는지 없는지
    val items2 = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items2 -> println("juicy")
        "apple" in items2 -> println("apple is fine too")
    }

    //람다식으로도 가능
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    println("===================================")

    //nullable ans null check
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    println("===================================")

    //type check and automatic casts
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. " +
                "Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

    println("===================================")

    //is 연산자
    fun printLength2(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: The object is not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength("")
    printLength(1000)

}
fun maxOf(a:Int, b:Int): Int {
    if(a > b)
        return a
    else
        return b
}

fun max2(a:Int, b:Int) = if(a > b) a else b

fun describe(obj: Any): String =
    when(obj) {
        1 -> "One"
        "Hello" -> "greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    //x * y 사용시 null 포함 가능 == 오류 발생
    if (x != null && y != null) {
        //null 체크 후 x, y가 불변타입으로 캐스팅됨
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null
}

//is 연산자 : 식의 유형이 인스턴스인지 확인
//특정 유형에 대해 불변타입 혹은 속성을 체크하는 경우 명시적 캐스팅 필요X
fun getStringLength2(obj: Any): Int? {
/*    if (obj is String) {
        return obj.length
    }
    return null*/

    //or
    if (obj !is String) return null
    return obj.length

    //or
/*    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null*/
}