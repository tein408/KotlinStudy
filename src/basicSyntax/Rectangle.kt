package basicSyntax

class Rectangle(var height: Double, var length : Double) {
    var perimeter = (height + length) * 2
}

//클래스 상속은 : 이용
//클래스는 기본적으로 final이 기본
//상속 가능하게 하려면 class 앞에 open 사용
open class Shape
class Rectangle2(var height: Double, var length : Double): Shape() {
    var perimeter = (height + length) * 2
}

fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("perimeter = ${rectangle.perimeter}")
}