package lec10

abstract class Animal(
    protected val species: String,
    //프로퍼티를 override 할 경우 반드시 open 키워드 필요
    protected open val legCount: Int
){
    abstract fun move()
}