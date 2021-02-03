package chap04.section4

var global = 10

fun main() {


    //localFunc1() -> 사용불가
    //지역함수 -> 선언된 이후에 사용해야함
    fun localFunc1(){
        println("localFucn1")
    }
    localFunc1()

    global = 15
    println(global)
    userFunc()
    println("final - global: $global")
}

fun userFunc() {
    global = 20
    println("userFunc - global: $global")
}
