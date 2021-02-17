fun sum(a: Int, b: Int): Int{
    val total = a + b
    return total
}

fun bagi(c: Int, d:Int) : Int{
    if (d == 0){
        return 0
    }else{
        var jumlah = c / d
        return jumlah
    }
}

fun main(){
    println(bagi(5,0))
    val pembagi = bagi(10,10)
    print(pembagi)
}