fun jumlah(a:Int, b:Int):Int{
    val total = a +b
    return total
}
fun bagi(a:Int, b:Int):Int{

    if (a == 0 || b == 0){
        return 0
    }else{
        val total = a / b
        return total
    }
}

fun main() {
    println(jumlah(10,39))

    var result = jumlah(30,70)
    println(result)

    println(bagi(5,0))
}