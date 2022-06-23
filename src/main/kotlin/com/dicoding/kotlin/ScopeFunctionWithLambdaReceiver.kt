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


}

