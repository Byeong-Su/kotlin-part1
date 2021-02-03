package chap05.section1

fun main() {

    print("Enter the score: ")

    //readLine() : 콘솔로부터 입력받음
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if(score >= 90.0){
        grade = 'A'
    } else if(score in 80.0..89.9){ //범위연산자 사용
        grade = 'B'
    }

    println("score: $score, grade: $grade")
}