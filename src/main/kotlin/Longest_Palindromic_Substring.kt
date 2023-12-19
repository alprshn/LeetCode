import kotlin.math.max

fun main(args: Array<String>) {

    var string : String = "babad"
    longestPalindrome(string)

}

fun longestPalindrome(s: String): String {
    var stringList: MutableList<String> = mutableListOf()
    var fakeList: MutableList<String> = mutableListOf()
    var resultList: MutableList<String> = mutableListOf()

    var maxi = 0
    var fakeMax=0

    for (x in s){
    stringList.add(x.toString())
    }

    var f = 0
    for (j in 0..stringList.size-1){
        for (z in f..stringList.size-1){
            fakeList.add(stringList[z])
            if (fakeList == fakeList.reversed()){
                maxi = max(maxi, fakeList.size)

                if (maxi > fakeMax){
                    resultList.clear()
                    fakeMax = maxi
                    resultList = (resultList + fakeList).toMutableList()
                }
            }
        }
        fakeList.clear()
        f++
    }
    var a:String=""

    for (v in resultList){
        a += v
    }
    return a
}