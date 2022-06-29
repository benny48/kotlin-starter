fun main() {
    val numbers = 1.rangeTo(12)
    val eventNumbers = numbers.filter(:: isEventNumber)

    println(eventNumbers)
}
fun isEventNumber(number: Int) = number % 3 == 0

//mereferensikan sebuah extensions function

