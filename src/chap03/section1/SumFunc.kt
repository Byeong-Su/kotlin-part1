package chap03.section1

fun sum(a: Int, b: Int): Int{
    return a+b
}   //최상위함수
//축약방법 1.     fun sum(a: Int, b: Int): Int = a+b
//축약방법 2.     fun sum(a: Int, b: Int) = a+b

fun max(a: Int, b: Int):Int{
    return if (a>b) a else b
}

fun outfunc(name: String): Unit{
    println("Name: $name")
    //return Unit 생략됨
}

//디폴트 인자 사용
fun sum3(a: Int = 2, b: Int = 5): Int {
    return a + b
}

fun main() {    //최상위(Top - level) 함수
    val result1 = sum(2,3)
    println(result1)

    val a = 3
    val b = 5

    val result2 = max(a,b)
    val result3 = sum3()
    val result4 = sum3(b=3)

    println(result2)
    outfunc("Kildong")
    println(result3)
    println(result4)



    fun sum2(a: Int, b: Int): Int{
        return a+b
    }   //지역함수(중괄호 내부에 존재하기 때문)
}

