fun main() {
    //BEST PRAKTIS DI MATEMATIKA
    //OPERATOR
    /*
    + = Penjumlahan
    - = Pengurangan
    * = Perkalian
    / = Pembagian
    % = Sisa Pembagian
    */

    //AUGMENTED ASSIGNMENTS
    /*
    a = a + 10   ->   a += 10
    a = a - 10   ->   a -= 10
    a = a * 10   ->   a *= 10
    a = a / 10   ->   a /= 10
    a = a % 10   ->   a %= 10
    * */

    //UNARY OPERATOR
    /*
    ++    =     a = a + 1
    --    =     a = a - 1
    -     =     Negative
    +     =     Positive
    !     =     Boolean Kebalikan
    * */

// OPERASI MATEMATIKA
    val result =  1 + 2
    println(result)
    val result2 =  1 - 2
    println(result2)
    val result3 =  1 * 2
    println(result3)
    val result4 =  10.0 / 3.0
    println(result4)
    val result5 =  5 % 2
    println(result5)


//AUGMENTED ASSIGNMENTS
    var total : Int = 0

    val barang1 = 100
    //total = total + barang1
    total += barang1

    val barang2 = 150
    //total = total + barang2
    total += barang2
    println(total)

    //UNARY OPERATOR
    total++ //total = total + 1
    total-- //total = total - 1
    println(total)

    val sehat = true
    println(!sehat)

}