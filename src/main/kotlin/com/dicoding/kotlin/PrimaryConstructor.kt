class Kewanses(var name: String,
               var weight: Double,
               var age: Int,
               var isMammal: Boolean = true)

class Kewanse(var name: String,
              var weight: Double,
              var age: Int = 0,
              var isMammal: Boolean = true)

fun main() {

    val dicodingCat = Kewanses("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, " +
            "Berat: ${dicodingCat.weight}, " +
            "Umur: ${dicodingCat.age}, " +
            "mamalia: ${dicodingCat.isMammal}" )

    val dicodingKewan = Kewanse("anjing", 4.2)
    println("Nama: ${dicodingKewan.name}, " +
            "Berat: ${dicodingKewan.weight}," +
            " Umur: ${dicodingKewan.age}, " +
            "mamalia: ${dicodingKewan.isMammal}" )
}