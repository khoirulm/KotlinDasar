fun main() {

    /*Range untuk Kebutuhan data angka yang berurutan dan banyak,
     mungkin membuat data berurutan yang sedikit bisa menggunakan Array
     tapi jika membuat data berurutan yang sangat banyak munkin itu sangat merepotkan,
     di sinilah Range di butuhkan*/

    //BEST PRAKTIS RANGE
    //variabel = firs..last

    //OPERASI
    //count() = Mendapatkan jumlah data Range
    //contains(value) = Mengecek apakah terdapat value tersebut
    //first = Mendapat nilai pertama
    //last = Mendapat nilai terakhir
    //step = Mendapat nilai tiap kenaikan


    //val range = 1..1000
    //val range = 1000 downTo 1
    val range = 1000 downTo 1 step 5

    println(range.count())
    println(range.contains(200))
    println(range.contains(-1))
    println(range.first)
    println(range.last)
    println(range.step)

}