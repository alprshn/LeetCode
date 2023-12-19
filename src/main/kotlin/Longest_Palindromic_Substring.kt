import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "babad"
    longestPalindrome(string)

}

fun longestPalindrome(s: String): String {
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