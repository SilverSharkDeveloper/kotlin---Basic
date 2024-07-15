package lec10

interface Swimable {

    val swimAbility: Int
    fun act(){
        println("어푸")
        //초기화 되지 않은 프로퍼티를 구현체에서 getter을 구현할것이기 때문에 인터페이스에섯 사용 가능
        println(swimAbility)
    }
}