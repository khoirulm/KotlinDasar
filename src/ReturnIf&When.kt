

//BIASA
//fun belajar(ngantuk:String, name:String):String{
//    if (ngantuk == "Tidak") {
//        return "$name Semangat Belajar"
//    }else{
//        return "$name Tidur Gasik"
//    }
//}


//Return : Lebih simple hanya menggunakan sekali saja sebelum if;
fun belajar(ngantuk:String, name:String):String{
    return if (ngantuk == "Tidak") {
         "$name Semangat Belajar"
    }else{
         "$name Tidur Gasik"
    }
}

////BIASA
//fun kerja(semangat:String, name:String):String{
//    when (semangat){
//        "YA" -> return "$name Kerja Keras"
//        else -> return "$name Malas Kerja"
//    }
//}

//Return : Lebih simple hanya menggunakan sekali saja sebelum when;
fun kerja(semangat:String, name:String):String{
    return when (semangat){
        "YA" -> "$name Kerja Keras"
        else -> "$name Malas Kerja"
    }
}


fun main() {
    println(belajar("Tidak","Khoirul"))
    println(kerja("YA","Khoirul"))
}