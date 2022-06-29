fun main() {
    //let
    val message: String? = null
    message?.let {
        val lenght = it.length * 2
        val text = "text lenght $lenght"
        println(text)
    }?: run {
        val text = "messege is null"
        println(text)
    }

    //also
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}