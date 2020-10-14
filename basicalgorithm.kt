fun main() {
    println(multiplicationTable(-1).toString())
    println(multiplicationTable(0).toString())
    println(multiplicationTable(1).toString())
    println(multiplicationTable(2).toString())
    println(multiplicationTable(3).toString())
}

fun multiplicationTable(n: Int): List<List<Int>>{
	if(n > 0) {
        var result = mutableListOf<MutableList<Int>>()
        for(x in 0 until n) {
            var xyz = mutableListOf<Int>()
            for(y in 0 until n) {
                var z = (y + 1) * (x + 1)
                xyz.add(z)
            }
            result.add(xyz)
        }
        return result
    } else {
        return listOf(listOf())
    }
}