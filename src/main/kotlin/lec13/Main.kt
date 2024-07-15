fun main(){

}

class outerClass(
    val name: String
){

    //외부 클래스에대한 참조가 없는 내부 클래스 (권장)
    class innerClass(
        var innerName: String
    )

    //외부 클래스 참조가 있는 내부 클래스 (권장되지 않음)
    //숨겨진 외부 클래스 정보를 가지고 있어 참조를 해지하지 못하는 경우 메모리 누수가 생김
    //매부 클래스의 직렬화에 대한 정의가 명확하지 않아 직렬화에 제한이 있음
    inner class innerClass2(
        var innerName: String
    ){
        init {
            //내부 클래스에서 외부 클래스를 참조할 때
            innerName = this@outerClass.name
        }
    }
}

