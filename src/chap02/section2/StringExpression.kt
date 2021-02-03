package chap02.section2

fun main() {
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}"

    //"를 출력하려면 \" 으로 써야함
    println("str1: \"$str1\", str2: \"$str2\"")
}