package chap04.section1

fun main() {

    val result: Int

    //일반변수에 람다식 할당
    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}    //생략되지 않은 전체 표현
    //val multi = {a: Int,b: Int -> a * b}                      //선언 자료형 생략
    //val multi: (a: Int,b: Int) -> Int = {a,b -> a * b}        //람다식 매개변수 자료형의 생략

    //(람다식 안에 람다식을 넣을 수 있다.)
    val nestedLambda: () -> () -> Unit = { { println("nested")} }

    result = multi(10,20)
    println(result)
}