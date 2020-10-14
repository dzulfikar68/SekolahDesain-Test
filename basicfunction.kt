fun main() {
    println(hello("john"))
    println(hello("aliCE"))
    println(hello())
    println(hello(""))
}

fun hello(name: String? = null): String{
    val world = if(name.isNullOrEmpty()) "World" else name.toLowerCase().capitalize()
	return "Hello, " + world + "!"
}