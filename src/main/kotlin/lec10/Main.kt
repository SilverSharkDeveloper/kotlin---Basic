package lec10

fun main(){
    val derived = Derived(10)
    //실행순서
    //상위클래스 init -> 하위클래스 init
}

open class Base(
    open val number:Int=100
){
    init{
        println("base")
        //하위 클래스에서 override 한 경우 하위 클래스 number에 접근하는데 상위 클래스의 init에서는 아직
        //하위 클래스가 인스턴스화 되기 전이라서 Int에 초기값인 0이 출력
        //상위 클래스의 생성자와 init블록에서는 하위 클래스의 override 필드에 접근하면 안됨
        //상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야함
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number){
    init {
        println("derived")
    }
}