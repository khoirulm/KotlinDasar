fun main(){

    val contohLamda:(String, String) -> String = {firstName:String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }
    val name = contohLamda("khoirul, muttaqin")
    print(name)

}