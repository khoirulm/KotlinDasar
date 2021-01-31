fun main() {
    // Kode : For Array
    var array = arrayOf("K", "H", "O", "I", "R", "U", "L")
    var total = 0
    for (name in array) {
        print(name)
        println(" = "+total++)
    }

    //Kode : For Range
    for(value in 0..50){
        print(value)
    }

    for(value in 100 downTo 0 step 5){
        print(value)
    }

    //Kode : For Array & Range
    //val ukuranArray =
    for(nilai in 0..array.size -1){
        println("Index $nilai = ${array.get(nilai)}" )
    }
}