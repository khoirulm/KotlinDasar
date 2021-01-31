fun main() {

    //underscore in Number
    var age : Byte = 10
    var height: Short = 200
    var distance : Int = 1_000
    var balance : Long = 100_000L


    //Floating point number
    var sample:Float = 98.7F
    var bukanSample: Double = 98.7

    //Literal
    var decimalLiteral : Int =100
    var hexadecimalLiteral : Int = 0xFFAB
    var binaryLiteral : Int = 0b1010101011


    var number: Int =100
    //Conversion
    var short : Short = number.toShort()
    var byte : Byte = number.toByte()
    var long : Long = number.toLong()
    var float : Float = number.toFloat()
    var double : Double = number.toDouble()


    println(hexadecimalLiteral)
    println(bukanSample)
    println(height)
    println(distance)
    println(balance)
}