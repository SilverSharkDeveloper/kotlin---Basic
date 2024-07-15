package lec17

import com.lannstark.lec17.Fruit
import java.io.BufferedReader
import java.io.FileReader

fun main(){
    val fruits = mutableListOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    //코틀린에서 함수는 1급객체 -> 값으로서 사용
    //람다식1 -> 익명 함수
    val isApple = fun(fruit:Fruit) : Boolean{
        return fruit.name=="사과"
    }

    //람다식2 -> 중괄호 사용
    val isApple2 = {fruit:Fruit -> fruit.name=="사과"}

    //함수에 함수 전달
   filterFruits(fruits,isApple)

    //함수에 람다 직접 전달
    filterFruits(fruits,{fruit -> fruit.name=="사과"})

    // 함수 파라미터 마지막이 함수라면 람다 전달시 중괄호를 밖으로 뺌
    // 람다의 마지막 expression 결과는 자동으로 람다의 반환 값
    filterFruits(fruits){fruit -> fruit.name=="사과"}

    //람다에 파라미터가 한개라면 it로 바로 사용가능
    filterFruits(fruits){it.name=="사과"}

    //람다를 호출하는 시점에 참조하고 있는 변수들을 모두 포획해서 가지고있음 ->일급객체
    //가변 변수에 대하여 람다에서 호출할 수 있음
    //이러한 데이터 구조를 closure라고 함
    var targetFruit = "바나나"
    targetFruit = "수박"
    filterFruits(fruits){it.name==targetFruit}



}

data class Fruit(
    val name: String,
    val price: Int
)

private fun filterFruits(fruits: List<Fruit>,filter:(Fruit)->Boolean) : List<Fruit>{
    val results = mutableListOf<Fruit>()
    for(fruit in fruits){
        if(filter(fruit)){
            results.add(fruit)
        }
    }
    return results
}


