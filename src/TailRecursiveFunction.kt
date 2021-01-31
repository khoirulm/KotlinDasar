//Khoirul Muttaqin
//Place : TelukJambe, Karawang
//Date : 17 Agust 2020

//1.Recursive function adalah salah satu kemampuan bagus di Kotlin, namun sayangnya ada
//keterbatasan dalam penggunaan recursive
//2.Jika recursive function yang kita buat, saat dijalankan memanggil function dirinya sendiri terlalu
//dalam, maka bisa dimungkinkan akan terjadi error stack overflow

//Stack Overflow Error
//factorial(5)
//factorial(5) => 5 * factorial(4)
//factorial(5) => 5 * factorial(4) => 4 * factorial(3)
//factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2)
//factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1)
//factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1) => 1

//3.Permasalahan ini di bahasa pemrograman Java tidak bisa ditangani
//Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan tail recursive function
//4.Tail recursive function adalah teknik mengubah recursive function yang kita buat, menjadi looping
//biasa ketika dijalankan
//5.Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function, ada
//syarat-syarat nya

//6.Tambahkan tailrec di functionnya
//7.Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa
//embel-embel operasi dengan data lain

//factorialTail(5, 1)
//factorialTail(4, 5)
//factorialTail(3, 20)
//factorialTail(2, 60)
//factorialTail(1, 120)
//120

fun main(){
    //Recursive function biasa, (Terbatas)
//    fun display(value: Int){
//        println("Recursive $value")
//        if(value > 0 ){
//            display(value -1)
//        }
//    }
//
//    display(100)


//    Tail Recursive Function (Tidak terbatas) -> Mengakalinya saat di compail System akan  mengubah menjadi ke looping
    tailrec fun display(value: Int){
        println("Recursive $value")
        if(value > 0 ){
            display(value -1)
        }
    }
    display(10000)


//    fun factorialTail(value: Int):Int{
//        return when(value){
//            1 -> 1
//            else  ->  value * factorialTail(value -1)
//        }
//    }
//
//    print(factorialTail(10))




    tailrec fun factorialTail(value: Long, total: Long = 1) : Long{
        return when(value){
            1L -> total
            else  ->  factorialTail(value -1, total * value)
        }
    }

    print(factorialTail(100))
}