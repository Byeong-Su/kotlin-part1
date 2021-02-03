package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    //=== 는 참조가 같은지 확인
    println("str1 === str2 ${str1 === str2}")
    println("str1 === str3 ${str1 === str3}")
}