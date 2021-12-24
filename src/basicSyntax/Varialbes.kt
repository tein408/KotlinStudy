fun main() {


    //불변 타입 val
    //Int형 변수 생성과 초기화를 동시에
    val a: Int = 1

    //컴파일러가 변수 타입 추론 가능할 경우엔 생략 가능
    //변수 생성시 초기화된 타입으로 변수 추론
    val b = 2

    //Int형 생성 후 초기화를 나중에
    val c: Int
    c = 3

    ///////////////////////////////////////

    //가변 타입 var
    var x = 5
    x++
    println("x = $x")

    ///////////////////////////////////////

    println("p = $p; PI = $PI")
    incrementX()
    println("incrementX()")
    println("p = $p; PI = $PI")

    ///////////////////////////////////////

    var one = 1
    var s = "one is $one"

    one = 2
    var s2 = "${s.replace("is", "was")}, but now $one"

    println(s2)


}

val PI = 3.14
var p = 0

fun incrementX() {
    p ++
}





