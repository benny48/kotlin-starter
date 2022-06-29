fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumber = numbers.filter (Int::isEvenNumber)

    println(evenNumber)
}

fun Int.isEvenNumber() = this % 2 == 0