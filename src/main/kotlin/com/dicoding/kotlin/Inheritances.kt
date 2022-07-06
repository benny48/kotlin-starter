open class Binatang(val name: String, val weight: Double, val age: Int, val isCarnivora: Boolean){
    open fun eat(){
        println("$name Sedang makan!")
    }

    open fun sleep(){
        println("$name sedang Tidur")
    }

}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Binatang(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

class Wedus(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Binatang(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name nyruduk menugso !")
    }

    override fun eat(){
        println("$name mangan suket !")
    }

    override fun sleep() {
        println("$name ora tau turu!")
    }
}

fun main() {
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()

    val dicodingWedus = Wedus("Wedus",10.2,4,false,"gembel",4)

    dicodingWedus.playWithHuman()
    dicodingWedus.eat()
    dicodingWedus.sleep()

}