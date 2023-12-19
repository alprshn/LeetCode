import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "aaaa"
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
    var len = s.length
    var longestPalindromeSlidingWindow = s[0].toString()
    if (len == 1) return longestPalindromeSlidingWindow
    for (i in 1 until len){
        var l = i-1
        var r = i
        if (s[l] == s[r]){
            if (l-1 >= 0 && s[l-1] == s[r]){
                l--
            }
        }
        else
        {
            if (l-1 >= 0 && s[l-1] == s[r]){
                l--
            }
        }
        while (l>=0 && r < len && s[l] == s[r]){
            l--
            r++
        }
        l++
        r--
        if (l != r){
            val tempPalindrome = s.substring(l,r+1)
            if (tempPalindrome.length > longestPalindromeSlidingWindow.length){
                longestPalindromeSlidingWindow = tempPalindrome
            }
        }
    }
    return longestPalindromeSlidingWindow
}