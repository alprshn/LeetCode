fun main(args: Array<String>) {

    var string : String = "babad"
    longestPalindrome(string)

}

fun longestPalindrome(s: String): String {
    var stringList: MutableList<String> = mutableListOf()
    var fakeList: MutableList<String> = mutableListOf()
    for (x in s){
    stringList.add(x.toString())
    }
    //println(stringList)
    var f = 0
    for (j in 0..stringList.size-1){
        for (z in f..stringList.size-1){
            fakeList.add(stringList[z])
            println(fakeList)
        }
        fakeList.clear()
        f++
    }
    return ""
}