abstract class Kewann(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
    fun eat(){
        println("$name sedang makan")
    }
    fun sleep(){
        println("$name sedang tidur")
    }

}

fun main() {
    val wedus = Kewann("wedus",20.4,4,false)
}