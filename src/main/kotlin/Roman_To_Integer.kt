fun main(args: Array<String>) {

    var a = romanToInt("IV")
    println(a.toString())
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
    var result: Int = 0
    var number = 0


    var i = 0
    while (i < s.length) { // Changed to while loop
        val romanNumber = s[i]
        if (hashMap.contains(romanNumber)) {
            if (s[i] == 'I' && (s[i+1] == 'V'|| s[i+1] == 'X')){
                number = hashMap[s[i+1]]?.minus(hashMap[romanNumber]!!)!!
                result += number
                i += 1
            }
            result += hashMap[romanNumber]!!
        }
    }


    return result
}

