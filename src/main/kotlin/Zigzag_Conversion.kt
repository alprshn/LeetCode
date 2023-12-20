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
        //var f:Int = ((numRows * 2)-1) + x
        //j += s[x] + s[f].toString()
        var r = x
        while (r < s.length-1){
            j += s[r]
            r += ((numRows * 2) - 1)

        }
        println(j)
        j = ""

    }

    return ""
}