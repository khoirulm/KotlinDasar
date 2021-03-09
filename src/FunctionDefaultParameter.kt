fun hello(firstName:String, lastName:String = ""){
        println("Hello $firstName $lastName")
}

fun main() {
    hello("Khoirul")
    hello("Khoirul", "Muttaqin")
}