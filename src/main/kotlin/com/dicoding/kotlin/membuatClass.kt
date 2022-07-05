class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isAnimal: Boolean
){
    fun eat(){
        println("$name Makan")
    }
    fun sleep(){
        println("$name Tidur")
    }
}

fun main() {
 val dicodingCat = Animal("Kucing",4.2,2,true)
    println("Nama: ${dicodingCat.name}," +
            "Berat: ${dicodingCat.weight}," +
            "Umur: ${dicodingCat.age}," +
            "Mamalia: ${dicodingCat.isAnimal}")

    dicodingCat.eat()
    dicodingCat.sleep()

}