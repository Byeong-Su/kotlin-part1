package chap06.section7

import java.io.FileOutputStream
import java.io.PrintWriter

//보통 특정 객체가 사용된 후 닫아야 하는 경우가 생기는데 이때 use()를 사용하면 객체를 사용한 후 close() 등을 자동적으로 호출해 닫아 줄 수 있음
fun main() {

    PrintWriter(FileOutputStream("d:\\test\\output.txt")).use {
        it.println("hello")
    }
}