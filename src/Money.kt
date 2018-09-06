fun main(args: Array<String>) {
    println("Today 1 dollar = 69.10 rubles\n" +
            "If you want to convert rubles into dollars(RUB->USD), press 1.\nIf you want to convert dollars into rubles(USD->RUB), press 2.")
    when(readLine()) {
        "1" -> {
            println("Minimum amount of input: 0.69 RUB\nEnter the amount of money:")
            transferRub(readLine()!!.toDouble())
        }
        "2" -> {
            println("Minimum amount of input: 0.01 USD\nEnter the amount of money:")
            transferUsd(readLine()!!.toDouble())
        }
        else -> println("Error.Try again.")
    }
}

fun transferRub(values: Double) {
    if (values >= 0.68) {
        val result: Double = values/69.10
        println("Done:" + String.format("%.2f", result) + " USD")
    }
    else println("Error. Please enter a different amount.")

}

fun transferUsd(values: Double) {
    if (values >= 0.01) {
        val result: Double = values*69.10
        println("Done:" + String.format("%.2f", result) + " RUB")
    }
    else println("Error. Please enter a different amount.")
}