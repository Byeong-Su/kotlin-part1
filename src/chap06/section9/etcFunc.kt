package chap06.section9

//takeIf()함수는 람다식이 true이면 결과를 반환하고, takeUnless()함수는 람다식이 false이면 결과를 반환합니다.
// 표준 함수의 정의
public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T?
        = if (predicate(this)) this else null


//코틀린 kotlin.system 패키지에 있는 두 개의 측정 함수 measureTimeMillis()와 measureNanoTime()을 사용
// 코틀린 system 패키지의 Timing.kt 파일
public inline fun measureTimeMillis(block: () -> Unit): Long {
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}

public inline fun measureNanoTime(block: () -> Unit): Long {
    val start = System.nanoTime()
    block()
    return System.nanoTime() - start
}

//시간 측정함수 사용 예
/*val executionTime = measureTimeMillis {
    // 측정할 작업 코드
}
println("Execution Time = $executionTime ms")*/



// 코틀린에서는 멀티플랫폼에서도 사용 가능한 kotlin.random.Random를 제공
/*
import kotlin.random.Random
...
val number = Random.nextInt(21)  // 숫자는 난수 발생 범위
println(number)*/
