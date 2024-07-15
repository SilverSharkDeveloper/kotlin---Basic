package lec10

class Penguin(
    species:String
) : Animal(species,2), Swimable,Flyable{

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄")
    }

    //프로퍼티 override
    //프로퍼티에 경우 커스텀 겟터를 만들면 함수의 리턴값이 항상 쓰이므로 초기화가 필요하지 않음
    override val legCount: Int
        get() =super.legCount + this.wingCount

    override fun act() {
        //중복된 인터페이스를 특정지을때 제네릭 사용
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override val swimAbility: Int
        get() = 3
}