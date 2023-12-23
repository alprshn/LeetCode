import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "PAYPALISHIRING"
    var numRows: Int = 4
    convert(string,numRows)
}

fun reverse(x: Int): Int {
    if (numRows == 1) {
        return s
    }

    val result = StringBuilder()
    val n = s.length
    val interval = 2 * numRows - 2

    for (i in 0 until numRows) {
        for (j in i until n step interval) {
            result.append(s[j])
            if (i != 0 && i != numRows - 1 && j + interval - 2 * i < n) {
                result.append(s[j + interval - 2 * i])
            }
        }
    }
    println(result.toString())
    return result.toString()
}
