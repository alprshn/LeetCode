import kotlin.math.max

fun main(args: Array<String>) {

    reverse(-100)
}

fun reverse(x: Int): Int {
    var stringNumber: String = x.toString()
    var c = stringNumber.length-1
    if (stringNumber[0] == '-'){
        val fakeString = stringNumber[0]

        stringNumber = stringNumber.substring(1, c + 1) + fakeString
    }
    println(stringNumber)

    var result:String= ""

    while (0 < c){
            result += stringNumber[c]
        c--
    }
    println(result)


    return 0
}
