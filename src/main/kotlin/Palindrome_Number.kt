fun main(args: Array<String>) {

    var a:Boolean = isPalindromeBruteForce(122)
    println(a)
   // var b:Boolean = isPalindromeSlidingWindow(121)

    //println(a.toString())
}

fun isPalindromeBruteForce(x: Int): Boolean {
    var x = x.toString()
    var resultLeft = ""
    var resultRight =""
    var j: Int = x.length-1
    for (i in 0 until  x.length ){
        resultLeft += x[i]
    }

    while (j >= 0){
        resultRight += x[j]
        j--
    }
    println(resultLeft)

    println(resultRight)
    return if (resultRight == resultLeft) true else true
}

fun isPalindromeSlidingWindow(x: Int): Boolean {

    return true
}
