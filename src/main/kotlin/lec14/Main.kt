package lec14



//data class
//equeals, hashcode, toString 자동 정의
data class Person(
    val name: String,
    val age: Int
)

//enum 클래스
enum class Country(
    private val code: String
){
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country){
    //enum 클래스를 when 과 같이 사용시 컴파일 시점에 값을 기억해 값에 따른 분기처리에 효과적
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}


//sealed class,interface
//하위 클래스를 봉인하는 클래스
//컴파일 타임 때 하위 클래스의 타입을 모두 기억해 런타임때 클래스 타입이 추가될 수 없다.
//하위 클래스는 같은 패키지 안에 있어야함
//추상화가 필요한 엔티티나 dto에 활용

sealed class Hyndae(
    private val car: String
)

class Avante : Hyndae(
    "아반떼"
)

class Sonata : Hyndae(
    "소나타"
)

fun handleCar(car: Hyndae){
    //when과 같이 사용시 sealed 클래스의 하위 구현체 타입에 따른 분기처리에 용이
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
    }
}


fun main(){

}