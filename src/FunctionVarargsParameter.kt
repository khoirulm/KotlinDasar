//Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
//Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
//Apa bedanya dengan parameter biasa dengan tipe data Array?
//Jika parameter tipe Array, kita wajib membuat array terlebih dahulu sebelum mengirimkan ke function
//JIka parameter menggunakan varargs, kita bisa langsung mengirim data nya, jika lebih dari satu, cukup gunakan tanda koma

fun penjumlahan(name: String, vararg values: Int): Int{
    var total = 0

    for (value in values){
        total += value
    }
    var result = println("$name Total belanjaan $total")
    return total

}

fun main() {


    var total = penjumlahan("Khoirul",10,10,10,10)


}