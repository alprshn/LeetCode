fun main(args: Array<String>) {

    var string : String = "babad"
    longestPalindrome(string)

}

fun longestPalindrome(s: String): String {
    var stringList: MutableList<String> = mutableListOf()

    for (x in s){
    stringList.add(x.toString())
    }
    println(stringList)
    return ""
}