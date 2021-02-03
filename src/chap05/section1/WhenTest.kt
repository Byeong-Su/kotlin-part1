package chap05.section1

fun main() {

    print("Enter the score: ")

    //readLine() : 콘솔로부터 입력받음
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score){
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9-> grade = 'B'
        else -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}