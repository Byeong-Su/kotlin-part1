package chap06.section3

//let()함수는 함수를 호출하는 객체 T를 이어지는 block의 인자로 넘기고 block의 결과값 R을 반환
//public inline fun <T, R> T.let(block: (T) -> R): R { ... return block(this) }

val score: Int? = 32
//...
// let을 사용해 null 검사를 제거
fun checkScoreLet() {
    score?.let { println("Score: $it") } // ①
    val str = score.let { it.toString() } // ②
    println(str)
}

//null 가능성 있는 객체에서 let() 활용
/*obj?.let { // obj가 null이 아닐 경우 작업 수행 (Safe calls + let 사용)
    Toast.makeText(applicationContext, it, Toast.LENGTH_LONG).show()
}*/