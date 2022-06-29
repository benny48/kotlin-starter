import java.lang.StringBuilder

fun main() {
    // run
    val text = "Hello"
    val result = text.run{
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text $from to $to"
    }
    println("result : $result")

    //with
    val message = "Hello Kotlin"
    val hasil = with(message){
        println("value is $this")
        println("with leght ${this.length}")
    }

    //with kembalian berdasarkan expression
    val pesan = "Benny Arfan"
    val hasilPesan = with(pesan){
        "first charecter is ${this[1]} " + "and last character is ${this[this.length - 1]}"
    }
    println(hasilPesan)

    //receiver
    val builder = StringBuilder()
    builder.append("hello ")
    builder.append("Kotlin")

    println(builder.toString())

    //fungsi apply
    val ok = StringBuilder().apply {
        append("Hola ")
        append("Kotlin")
    }
    println(ok.toString())
}

