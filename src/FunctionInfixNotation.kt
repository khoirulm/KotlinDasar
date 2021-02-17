infix fun String.to(type : String) : String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){
    val result = "Khoirul" to "UP"
    print(result)


    100 downTo 1
}