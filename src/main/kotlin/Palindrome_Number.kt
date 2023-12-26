fun main(args: Array<String>) {

    //var a: Boolean = isPalindromeBruteForce(122)
    //println(a)
    var b:Boolean = isPalindromeSlidingWindow(1221)
    println(b.toString())
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
    var r: Int = sum + 1
    var l: Int = sum - 1
    while (l >= 0 || r <= x.length -1) {
        if (x.length/2.toDouble() % 2 != 0.0 ){
            resultRight += x[r]
            resultLeft += x[l]
        }
        else{
            resultRight += x[r-1]
            resultLeft += x[l]
        }
        l--
        r++
    }


    return if (resultRight == resultLeft) return true else false
}
