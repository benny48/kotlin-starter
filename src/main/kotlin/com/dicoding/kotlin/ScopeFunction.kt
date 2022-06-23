import java.lang.StringBuilder

fun main() {
    //lambda receiver (this)
    val stringBuilder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin")
    }
    println(stringBuilder)

    //lambda argument (it) (let)
    val text = "Hello"
    text.let{
        val messege = "$it Benny"
        println(messege)
    }

    //lambda argument (it) (let) bentuk lain

    val text1 = "Hello"
    text1.let{value ->
        val message1 = ("$value Arfan")
        println(message1)
    }
}