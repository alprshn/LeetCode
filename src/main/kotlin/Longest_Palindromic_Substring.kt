import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "babad"
    longestPalindrome(string)

}

fun longestPalindrome(s: String): String {
    var fakeList: MutableList<String> = mutableListOf()
    var resultList: MutableList<String> = mutableListOf()
    var a:String=""
    var maxi = 0
    var fakeMax=0
    var t = ""

    var f = 0
   while (f < s.length){
        for (z in f..s.length-1){
            //fakeList.add(s[z].toString())
            t+= s[z]
            if (t == t.reversed()){
                maxi = max(maxi, t.length)
                if (maxi > fakeMax){
                    //resultList.clear()
                    a=""

                    fakeMax = maxi
                    a = t


                    //resultList = (resultList + fakeList).toMutableList()
                }
            }

        }
        fakeList.clear()
       t = ""
        f++
    }

    println(a)
    //for (v in resultList){
        //a += v
    //}
    //println(a)
    return a
}