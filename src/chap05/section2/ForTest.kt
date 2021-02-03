package chap05.section2

fun main() {

    var total = 0

    for (num in 1..100 step 2) { //홀수합
        total += num
    }
    println("total: $total")

    //하향방법
    for (i in 5 downTo 1) print(i)
}