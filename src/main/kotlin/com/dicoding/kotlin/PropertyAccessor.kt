class Kewan{
    var name: String = "Kucing"
    get(){
        println("Fungsi Getter Terpanggil")
        return field
    }
    set(value) {
        println("Fungsi Setter Terpanggil")
        field = value
    }
}

fun main() {
val dicodingCat = Kewan()
    println("Nama: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}