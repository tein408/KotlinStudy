package basicSyntax

fun main() {
    //5칸 배열 arr에 원소를 1씩 증가하여 담는다
    var arr = IntArray(5) {it * 1}

    //0 1 2 3 4 출력
    for(i in arr)
        print("${i} ")

    println()

}
