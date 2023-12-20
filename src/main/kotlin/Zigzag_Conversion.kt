import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "PAYPALISHIRING"
    var numRows: Int = 4
    convert(string,numRows)
}

fun convert(s: String, numRows: Int): String {

    var j =""

    for (x in 0 until numRows){
        //println(x)
        //var f:Int = ((numRows * 2)-1) + x
        //j += s[x] + s[f].toString()
        var e = (numRows-2)*2
        var z = 0
        var r = x
        while (r <= s.length-1 && r >= 0){
                j += s[r]
                r += ((numRows * 2) - 2)
        }
        e -=2
        z +=2

        println(j)

        j = ""

    }

    return ""
}