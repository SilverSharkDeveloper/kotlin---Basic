package lec09

import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

fun main(){
    val person = Person("1")
    person.age = 13
}

class Person(
    //주 생성자로 반드 시 필요
    //val,var 키워드를 붙여주면 프로퍼티로 만들어 필드와 getter,setter을 자동으로 만들어줌
    //val은 불변이므로 setter을 만들어주지않음
    //기본값 설정 가능
    val name: String,
    var age: Int =1
){

    //초기화 블록 객체가 처음생성될때 실행
    init {
        if(age<=0){
            throw IllegalArgumentException("나이는 0보다 작을 수 없음")
        }
    }

    //부생성자로 반드시 마지막엔 주생성자를 호출하도록 해야함 중간에 부생성자를 호출하는것은 가능
    //생성자 오버로딩이라면 주생성자에 기본값 설정이 더 나음
    //생성자에서 객체 변환 같은 작업을 할 때 사용할 수 있지만 부생성자 보다 정적 팩토리 메서드 사용이 가독성에 더 좋음
    //따라서 잘 안씀
    constructor(name:String) : this(name,1){
        println(this.name)
    }


    //클래스의 메서드
    //인스턴스에서 함수를 사용할때 사용
//    fun isAdult():Boolean{
//        return this.age>=20
//    }


    //custom getter을 통해 함수를 마치 프로퍼티처럼 사용 (실제 메모리상에선 함수)
    //인스턴스의 속성을 표현할 때 주로 사용
    val isAdult:Boolean
        get() =this.age>=20
}

