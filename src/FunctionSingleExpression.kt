fun kaliDua(a : Int) : Int = a * 2 // Single Expression return : Untuk function yang sederhana(satu baris)
//fun kali Dua(a : Int) : Int{
// return a * 2
// } Function Return Type (biasa terlalu panjang)

fun sapa(name : String) : Unit =  println("Hello $name") // Single Expression Tidak memiliki nilai balik : Untuk function yang sederhana(satu baris)
//fun sapa(name : String) : Unit{
// println("Hello $name")
//} Function tidak memiliki nilai balik (biasa terlalu panjang)
fun main(){
    println(kaliDua(10))
    sapa("Khoirul")
}