fun main() {
    var firstName:String = "Khoirul"
    var lastName:String = "Muttaqin"
    var addres:String ="""Kebandingan
        >RT 07 RW 02 Kecamatan Kedungbanteng
        >Kabupaten Tegal
    """.trimMargin(">")


    var fullName:String = "$firstName $lastName"
    var desc: String = "$firstName length = ${firstName.length}"
    println(fullName)
    println(desc)
}