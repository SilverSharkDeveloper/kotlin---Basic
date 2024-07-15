package lec16



fun main(){
    "123".lastchar()
    1.add(5)
    1 add 5
}



//확장함수
//this를 통해 수신 객체 인스턴스에 접근 가능
//원래 클래스에있던 멤버변수처럼 사용 가능
//캡슐화를 깨지 않기 위해서 private 또는 protected멤버를 가져올 수 없다
fun String.lastchar(): Char {
    return this[this.length-1]
}


//확장함수와 멤버함수의 시그니처가 동일하면 멤버함수가 우선적으로 호출됨
fun String.compareTo(){

}


//중위함수 (infix)
//파라미터가 한개인 경우에만 사용가능
// 변수 함수명 파라미터 이렇게 나열해서 함수를 사용
infix fun Int.add(other: Int):Int{
    return this + other
}

//인라인 함수 (inline)
//함수를 선언하고 호출하는 대신 호출한 지점에 함수 본문을 그대로 복붙 함
//함수를 파라미터로 넘길 때 오버헤드를 줄일 수 있음
//함수를 중첩해서 사용할 경우 함수 call chain에 오버헤드가 생기므로 이를 줄일 수 있음
//inline 함수는 성능측정과 함께 신중하게 사용되어야 한다.
inline fun Int.add2(other: Int):Int{
    return this + other
}


//지역함수 - 함수안에서만 사용할 함수
//depth가 깊어지기도 하고 코드가 그렇게 깔끔하지 않으므로잘 사용하지 않음

fun A(a:String):Int{
    fun B(b:String):Int{
        return b.length
    }
    return B(a)
}
