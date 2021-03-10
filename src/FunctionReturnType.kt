fun sum(a:Int, b:Int):Int{
    val total = a + b
    return total
}


fun bagi(a:Int, b:Int):Int{

    if (b == 0){
        return 0
    }else{
        val total = a/b
        return total
    }
}

fun main() {
    var result = sum(10,100)
    println(result)

    var pembagian = bagi(10,0)
    println(pembagian)
}