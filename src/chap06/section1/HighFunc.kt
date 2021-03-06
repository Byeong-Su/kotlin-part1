package chap06.section1

fun inc(x: Int): Int {
    return x + 1
}

fun high(name: String, body: (Int)->Int): Int {
    println("name: $name")
    val x = 0
    return body(x)
}

// 함수를 이용한 람다식
val result = high("Sean", {  x -> inc(x + 3) })

// 소괄호 바깥으로 빼내고 생략
val result2 = high("Sean") { inc(it + 3) }

// 매개변수 없이 함수의 이름만 사용할 때
val result3 = high("Kim", ::inc)

// 람다식 자체를 넘겨 준 형태
val result4 = high("Sean") { x -> x + 3 }

// 매개변수가 한 개인 경우 생략
val result5 = high("Sean") { it + 3 }