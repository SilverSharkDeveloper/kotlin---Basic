package lec12

import javax.swing.ImageIcon

fun main(){
    Person.newBaby("1")
}

class Person
//정적 메서드 사용을위하여 인스턴스화를 막음
private constructor(
    private val name: String,
    private val age: Int,
){

    //동행 객체 -> 클래스와 동행하는 유일한 객체 -> 정적 필드 관리
    //하나의 객체로 간주되어 이름을 붙이거나 interface를 구현할 수 있다
    companion object{
        //const는 compile 시점에 할당 -> 진짜 상수에 사용
        //기본 타입과 String 타입에만 사용 가능
        //object내와 톱레벨에서만 사용할 수 있음
        //compile 시점에 값이 결정되어 소스코드를 기계어 코드로 변환하는 과정에서 최적화가 가능
        private const val MIN_AGE = 0
        //정적 팩토리 메서드 형태로 인스턴스화
        fun newBaby(name:String): Person{
            return Person(name, MIN_AGE)
        }
    }
}

