fun main(args: Array<String>) {

    var a = reverse(-100)
    println(a.toString())
}

fun reverse(x: Int): Int {
    var stringNumber: String = x.toString()
    var c = stringNumber.length-1

    if (x > Int.MAX_VALUE || x < Int.MIN_VALUE){
        return 0
    }

    if (stringNumber[0] == '-'){
        val fakeString = stringNumber[0]

        stringNumber = stringNumber.substring(1, c + 1) + fakeString
    }
    //println(stringNumber)

    var result:String= ""

    while (0 <= c){
            result += stringNumber[c]
        c--
    }
    //println(result)
    try {
        return result.toInt()
    } catch (e: NumberFormatException) {
        return 0 // Handle overflow by returning 0
    }
}
