fun hello(firstName: String = "Mr", lastName: String = "Ganteng Banget"){
    println("$firstName $lastName")
}

fun main() {
    hello("Khoirul")
    hello()
    hello("Khoirul", "Muttaqin")
}