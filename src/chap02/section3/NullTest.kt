package chap02.section3

fun main() {
    var str1: String?
    str1 = "Hello"

    //${str1?.length}에서 str1?.은 null일 경우 뒷부분을 실행하지않고 바로 null을 반환하는 세이프 콜
    println("str1: $str1, length: ${str1?.length}")

    //${str1!!.length}에서 !!은 null일리 없다고 가정하는것 -> 오류유발가능성 있음
    println("str1: $str1, length: ${str1!!.length}")

    //판단문(?:인 엘비스연산자를 이용해 조건문을 축약)
    val len = str1?.length ?: -1
    println("str1: $str1, length: $len")
}