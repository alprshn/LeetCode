import kotlin.math.max

fun main(args: Array<String>) {

    reverse(-100)
}

fun reverse(x: Int): Int {
    var stringNumber: String = x.toString()
    var c = stringNumber.length-1
    var result:String= ""
    while (0 < stringNumber.length-1){
        if (stringNumber[c] != '-'){
            result += stringNumber[c]
        }
        c--
    }
    println(result)


    return 0
}
