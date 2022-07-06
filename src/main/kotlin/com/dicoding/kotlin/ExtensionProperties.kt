class Kewans(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Kewans.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val dicodingCat = Kewans("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}