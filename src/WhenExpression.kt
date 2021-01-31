fun main(){
    //Kode : When Expression
    val nilai = 'C'
    when (nilai){
        'A' -> {
            println("Amazing")
        }
        'B' -> {
        println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Tray Again Next Year")
        }
        else -> {
            println("Ups")
        }
    }

    //Kode : When Expression Multiple Option
    val finalExamp = "D"
    when(finalExamp){
        "A","B","C" -> {
            println("Amazing")
        } else ->{
        println("Tidak Lulus")
    }
    }

    //Kode : When Expression in
    var minimum = arrayOf<Int>(60,70,80,90,100)
    var ipk = 70
    when(ipk){
        in minimum -> println("Lulus")
        !in minimum -> println("Tidak Lulus")
    }

    //Kode : When Expression is
    var khoirul:String = "Khoirul"
    when(khoirul){
        is String -> println("khoirul is string")
        !is String -> println("khoirul not string")
    }


    //Kode : When Expression Pengganti if else

    var sekolah = 90
    when{
        sekolah > 80 -> println("Smart")
        sekolah > 70 -> println("Rata-Rata")
        else -> println("Belajar Lagi")
    }
}