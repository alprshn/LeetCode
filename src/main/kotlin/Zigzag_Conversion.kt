import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "PAHNAPLSIIGYIR"
    var numRows: Int = 3
    convert(string,numRows)
}

fun convert(s: String, numRows: Int): String {

    var j =""

    for (x in 1 until s.length ){
        //println(x)
        var f:Int = ((numRows * 2)-1) + x
        j += s[x] + s[f].toString()

        if (x == 1 || x == 6){
            println(j)
        }
        if (x != 1 ||  x != 6){
            println("_")
        }
    }

    var a =0
    while (a < s.length){

    }
    return ""
}