package com.dicoding.kotlin//class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    //val user = User("nrohmen", 17)
    /*val dataUser = DataUser("nrohmen", 17)
    val dataUser1 = DataUser("benny", 26)
    val dataUser2 = dataUser1.copy(age=27)*/

    val dataUser= DataUser("benny",26)
    dataUser.intro()
    //println(user)
    /*println(dataUser1)
    println(dataUser2)*/
    val list = (1..100).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}