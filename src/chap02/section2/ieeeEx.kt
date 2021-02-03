package chap02.section2

fun main() {
    var num: Double = 0.1

    for (x in 0..999){
        num += 0.1
    }

    //자료형의 특성때문에 조금 다른 값으로 나옴
    println("num: $num")
}