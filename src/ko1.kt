data class Person(val name: String, val age: Int ? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("똥팔이", 30), Person("3D", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("웃기고 있네...썩글 : $oldest")
    println("올 ~~ 이런 기능도 있고 좋네~~");

println("")
}