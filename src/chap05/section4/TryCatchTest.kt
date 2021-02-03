package chap05.section4

import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c: Int
    try{
        c = a /b
        println("after")
    } catch (e: Exception) {
        println("Exception")
    } finally { //파이널문은 무조건 실행됨
        println("Finally")
    }
}