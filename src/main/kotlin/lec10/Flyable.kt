package lec10

interface Flyable {


    //default 없이 구현된 함수 선언 가능
    fun act(){
        println("파닥")
    }

    fun fly()
}