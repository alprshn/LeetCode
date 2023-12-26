fun main(args: Array<String>) {

    //var a: Boolean = isPalindromeBruteForce(122)
    //println(a)
   // var b:Boolean = isPalindromeSlidingWindow(11)
    //println(b.toString())
    println(isPalindromeCheckTwo(112211))
}

fun isPalindromeBruteForce(x: Int): Boolean {
    var x = x.toString()
    var resultLeft = ""
    var resultRight = ""
    var j: Int = x.length - 1
    for (i in 0 until x.length) {
        resultLeft += x[i]
    }

    while (j >= 0) {
        resultRight += x[j]
        j--
    }
    println(resultLeft)
    println(resultRight)
    return if (resultRight == resultLeft) return true else false
}

fun isPalindromeSlidingWindow(x: Int): Boolean {
    var x = x.toString()
    var resultLeft = ""
    var resultRight = ""
    var sum: Int = x.length/2
    var r: Int = sum
    var l: Int = sum
    while (l >= 0 || r <= x.length -1) {
        if (x.length.toDouble() % 2 != 0.0 ){
            resultRight += x.getOrNull(r + 1) ?: ""
        }
        else{
            resultRight += x.getOrNull(r) ?: ""
        }
        resultLeft += x.getOrNull(l - 1) ?: ""
        l--
        r++
    }
    return if (resultRight == resultLeft) return true else false
}

fun isPalindromeCheckTwo(x: Int): Boolean {
    val str = x.toString()
    val length = str.length
    val mid = length / 2

    for (i in 0 until mid) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}