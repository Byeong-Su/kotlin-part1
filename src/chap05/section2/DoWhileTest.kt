package chap05.section2

fun main() {

    //5 -> 12345, 23451, 23412...
    do{
        println("Enter the number: ")
        val input = readLine()!!.toInt()

        //until쓰면 0부터 (input-1) 까지
        for(i in 0 until input){
            for(j in 0 until input){
                print((i+j)%input +1)
            }
            println()
        }
    }while(input !=0)
}