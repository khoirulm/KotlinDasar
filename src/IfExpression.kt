//IF EXPRESSION
/*
if(kondisi Boolean 1){
//Jika kondisi bernilai true
//maka isi blok if akan di eksekusi
}else if(kondisi Boolean 2){
//jika kondisi 2 benilai true
//maka isi blok kondisi 2 akan di eksekusi
}else{
//Jika kondisi bernilai false
//maka isi blok else akan di eksekusi
}
* */

fun main(){
    var nilai = 91

    if(nilai > 90){
        println("MANTAP")
    }else if(nilai > 80){
        println("Cool")
    }else if(nilai > 70){
        println("Good Job")
    }else{
        println("Coba Lagi Tahun Depan")
    }
}