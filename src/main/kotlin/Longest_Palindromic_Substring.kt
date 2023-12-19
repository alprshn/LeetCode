import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "babad"
    longestPalindromeBruteForce(string)
    println( longestPalindromeSlidingWindow(string))
}

fun longestPalindromeBruteForce(s: String): String {
    var a:String=""
    var maxi = 0
    var fakeMax=0
    var t = ""
    var f = 0
    while (f < s.length){
        for (z in f..s.length-1){
            t+= s[z]
            if (t == t.reversed()){
                maxi = max(maxi, t.length)
                if (maxi > fakeMax){
                    a=""
                    fakeMax = maxi
                    a = t
                }
            }
        }
        t = ""
        f++
    }
    return a
}

fun longestPalindromeSlidingWindow(s: String): String {
    var res = ""; var resLen = 0

    fun findLongest(l: Int, r: Int) {
        var l = l; var r = r;
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            if (r - l + 1 > resLen) {
                resLen = r - l + 1;
                res = s.substring(l, r + 1)
            }
            l --; r++
        }
    }

    for (i in 0 until s.length) {
        findLongest(i, i) // odd
        findLongest(i, i + 1) // even
    }
    return res
}