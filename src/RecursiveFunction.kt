fun factorial(value:Int):Int{
    var result = 1
    for(i in value downTo 1){
        result *= i
    }

    return  result
}

fun factorial2(value: Int):Int{
    return when(value){
        1 -> 1
        else -> value * factorial2(value -1)

    }

}

fun main(){
    println(factorial(10))
    println(factorial2(10))
}