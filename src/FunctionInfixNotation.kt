infix fun String.rubah(type : String) : String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){
    val result = "Khoirul" rubah "low"
    print(result)


    100 downTo 1
}