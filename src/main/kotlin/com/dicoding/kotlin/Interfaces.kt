interface IFly{
    fun fly()
    val numberOfWings: Int
}

class Manuk(override val numberOfWings: Int) : IFly {

    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

fun main() {
 val burungKu = Manuk(0)
    burungKu.fly()
}