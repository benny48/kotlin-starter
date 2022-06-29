import java.lang.IllegalArgumentException

fun main() {
    val summary = sum(3,3,3)
    if (summary <= 9) {
        val akhir = pengurangan(summary, 2)
        println(akhir)
    }else{
        println(summary)
    }

}

fun pengurangan(nilaiA: Int, nilaiB: Int): Int{
    val hasilnya = (nilaiA + nilaiB)
    return hasilnya
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 1) {
            throw IllegalArgumentException("value must be better than 1")
        }
    }
    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}