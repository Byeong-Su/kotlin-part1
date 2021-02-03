package chap03.section1

//vararg는 인자를 여러개 받는다는 것임
fun normalVarargs(vararg a: Int){
    for (num in a){
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4)
}