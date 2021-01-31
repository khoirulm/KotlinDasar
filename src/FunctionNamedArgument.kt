fun fullName(firstName:String, middleName:String, lastName:String){
    println("Hello $firstName $middleName $lastName")
}


fun main() {
    fullName("Khoirul","Al","Muttaqin")
    fullName(
            middleName = "Al",
            lastName = "Muttaqin",
            firstName = "Khoirul"

    )
}