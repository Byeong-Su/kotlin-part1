package chap03.section3

//람다식(람다식은 마지막인자로 넣는것이 좋다.)
fun highFunc(a:Int,b:Int, sum: (Int, Int) -> Int): Int{
    return sum(a, b)
}

fun main() {
    val result = highFunc(1,3,{x,y -> x + y})

    //아래와 같은 형태도 가능

    //val result = highFunc(1,3) {x,y -> x + y}

    //val result = highFunc(1,3) {x,y ->
    //    x + y
    //}


    println(result)
}