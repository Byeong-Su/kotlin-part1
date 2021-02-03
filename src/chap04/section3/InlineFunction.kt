package chap04.section3

//inline을 쓰면 호출하는 메인문 안에 shorFunc내용이 복사됨 즉 호출식이 아닌 내용을 메인에 복사시킴
//noinline은 inline쓰고싶지 않을때 사용
//crossinline은 인자내용을 반환하지못하게 하는것
inline fun shorFunc(a: Int, noinline out: (Int) -> Unit){
    println("Hello")
    out(a)
}

fun main() {
    shorFunc(3,{a-> println("a: $a")})
    //shorFunc(3){ println("a: $it")}
}