fun main(args: Array<String>) {

    var a = romanToInt("III")
    println(a)
}

fun romanToInt(s: String): Int {
    val hashMap = HashMap<Char, Int>()
    hashMap['I']= 1
    hashMap['V']= 5
    hashMap['X']= 10
    hashMap['L']= 50
    hashMap['C']= 100
    hashMap['D']= 500
    hashMap['M']= 1000


    return 0
}

