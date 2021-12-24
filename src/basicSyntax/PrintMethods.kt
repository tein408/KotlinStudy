
fun main(args: Array<String>) {
    //문자열 출력
    println("Hello world!!!!!")

    //줄바꿈 차이
    print("Hello ")
    println("World !!!")

    println(sum(3,5))
    println(sum2(3,5))

    printSum(-1, 8)
    printSum2(-1, 8)

}

//Int 타입 변수 각 입력 받고, return도 Int 타입으로
fun sum(a: Int, b: Int): Int {
    return a + b;
}

//한줄로 쓰기
fun sum2(a:Int, b:Int) = a + b

//출력하기
fun printSum(a:Int, b:Int): Unit {
    println("$a + $b = ${a+b}")
}

//Unit 은 생략 가능
fun printSum2(a: Int, b : Int) {
    println("$a + $b = ${a+b}")
}

