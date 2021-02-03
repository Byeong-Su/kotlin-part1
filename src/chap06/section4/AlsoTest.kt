package chap06.section4

fun main() {

    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Java"
        "Success"   //let이라 반환됨
    }
    println("a $a")
    println("person $person")

    val b = person.also {
        it.skills = "Java"
        "Success"   //also라 반환안됨
    }
    println("b $b")
    println("person $person")
}


//디렉터리 생성 활용

//기존의 디렉터리 생성 함수
/*fun makeDir(path: String): File{
    val result = File(path)
    result.mkdirs()
    return result
}*/

//let과 also를 통한 개선된 함수
//fun makeDir(path: String) = path.let{ File(it) }.also{ it.mkdirs() }

//let은 식의 결과로 반환하고 그 결과를 다시 also를 통해 넘겨짐. 이때 중간 결과가 아니라 넘어온 결과만 반환