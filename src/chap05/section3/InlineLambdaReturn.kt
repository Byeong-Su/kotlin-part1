package chap05.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int)->Unit){
    out(a,b)
}

fun retFunc(){
    println("start of Func")
    inlineLambda(12,3) { a, b ->
        val result = a + b
        if(result>10) return        //비지역반환이 일어나 retFunc자체가 종료됨
        println("result: $result")
    }
    println("end of Func")

    //비지역반환 문제 해결
    inlineLambda(12,3) lit@{ a, b ->
        val result = a + b
        if(result>10) return@lit        //라벨을 사용해서 비지역반환이 일어나지 않음
        println("result: $result")
    }
}