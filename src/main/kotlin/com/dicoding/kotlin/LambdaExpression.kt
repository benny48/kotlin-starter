fun main() {
    val contohLambda:(Int,Int) -> Int ={num1: Int, num2: Int ->
        val hasil = num1 + num2
        hasil
    }

    val hasil = contohLambda(3,4)
    println(hasil)
}