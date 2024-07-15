package lec11

fun main(){

    //접근 제어
    //public 기본값
    //protected -> 선언된 클래스, 하위클래서에서만 접근
    //internal -> 같은 모듈에서만 접근
    //private -> 같은 파일 에서만 접근
    //유틸성 모듈은 최상단 파일에 만들어서 사용
}


class A(
     a :String
){
    var ab = a
        private set
}

class B(
    private val b :String
){


}