fun main(args: Array<String>) {

    val byte: Byte      //содержит целое число от -128 до 127 (весит 1 байт)
    println("Byte:" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE)

    val short: Short    // содержит целое число от -32768 до 32767 (весит 2 байта)
    println("Short:" + Short.MIN_VALUE + " to " + Short.MAX_VALUE)

    val int: Int        //содержит целое число от -2147483648 до 2147483647 (весит 4 байта)
    println("Int:" + Int.MIN_VALUE + " to " + Int.MAX_VALUE)

    val long: Long      //содержит целое число от –9.223.372.036.854.775.808до9.223.372.036.854.775.807 (весит 8 байт)
    println("Long:" + Long.MIN_VALUE + " to " + Long.MAX_VALUE)

    val float: Float   //содержит число с плавающей точкой от -3.4*1038 до 3.4*1038 (весит 4 байта)
    println("Float:" + Float.MIN_VALUE + " to " + Float.MAX_VALUE)

    val double: Double  //содержит число с плавающей точкой от ±5.0*10-324 до ±1.7*10308 (весит 8 байта)
    println("Double:" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + "\n")

    val long1: Long = 5
    val float1: Float = 6F
    val double1: Double = 7.0

    val constInt: Int = (long1 + float1 + double1).toInt()
    val constFloat: Float = (long1 + float1 + double1).toFloat()
    val constDouble: Double = (long1 + float1 + double1)

    println("Int: $long1 + $float1 + $double1 = $constInt")
    println("Float: $long1 + $float1 + $double1 = $constFloat")
    println("Double: $long1 + $float1 + $double1 = $constDouble")
}