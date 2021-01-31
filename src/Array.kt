fun main(){

    //Best Praktis  Array
    //size = Untuk mendapatkan panjang Arrray
    //variabel.get(index) = Mendapat data di posisi index
    //variabel[index] = Mendapatkan data di posisi index
    //varaibel.set(index,value) = Mengubah data di posisi index
    //varaibel[index] = value = Mengubah data di posisi index

    //Kode : Array Nullable
    //variabel:Array<Tipe data?> arrayOfNulls(size: index)
    //ATAU
    //variabel = arrayOfNulls<Tipe data?>(size: index)




    val members = arrayOf<String>("EKO", " JOKO", "BUDI")
    val eko : String = members[0]
    val joko : String = members.get(1)
    val budi : String = members.get(2)

    members.set(0,"KHOIRUL")
    members[1] = "RUDI"
    members.set(2,"DENI")

    val khoirul : String = members[0]
    val rudi : String = members.get(1)
    val deni : String = members.get(2)

    println("$eko $joko $budi")
    println("$khoirul $rudi $deni")


    val names = arrayOfNulls<String?>(5)
    names[0] = "KHOIRUL"
    names[1] = "DENI"
    names[2] = "RUDI"
    names[3] = "KRISNA"
    names[4] = null

    println(names.size)
}