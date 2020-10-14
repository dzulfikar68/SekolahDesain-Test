fun main() {
    println(spreadString("cokecokecokefries"))
}

fun spreadString(input: String): String{
    var result = ""
    val listing = listOf("burger",
                         "fries",
                         "chicken",
                         "pizza",
                         "sandwich",
                         "onionrings",
                         "milkshake",
                         "coke")
    
    listing.forEach { zzz ->
        var a1 = zzz
        val c1 = a1.toRegex().findAll(input).count()
        for (x in 0 until c1) {
            result = result + a1.capitalize() + " "
        }
    }
    
    
	return result
}

// 1. Burger
// 2. Fries
// 3. Chicken
// 4. Pizza
// 5. Sandwich
// 6. Onionrings
// 7. Milkshake
// 8. Coke


