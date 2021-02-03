package chap04.section4

fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

//꼬리 재귀함수 -> 스택을 사용하지 않는 장점 가짐
tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}