// OPERASI BOOLEAN
//&& -> DAN
/*
true  && true  =  true
false && true  =  false
true  && false =  false
false && false =  false
* */

// || -> OR
/*
true  || true  =  true
false || true  =  true
true  || false =  true
false || false =  false
* */

//! -> NEGASI / NOT
/*
!true = false
!false = true
* */

fun main(){
    var hardSkill = 70
    var softSkill = 80
    var absen = 80

    val passHardSkill = hardSkill > 70
    val passSoftSkill = softSkill > 70
    val passAbsen = absen > 70

    var lulus =  passHardSkill && passSoftSkill || passAbsen
    if(lulus == true){
        println("Selamat Anda LULUS")
    }else{
        println("Maaf Anda TIDAK LULUS")
    }

    var Kelulusan =  passHardSkill || passSoftSkill && passAbsen
    if(Kelulusan == true){
        println("Selamat Anda LULUS")
    }else{
        println("Maaf Anda TIDAK LULUS")
    }
}
