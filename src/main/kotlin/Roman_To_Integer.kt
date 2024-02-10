fun main(args: Array<String>) {

    var a = romanToInt("III")
    println(a.toString())
}

fun romanToInt(s: String): Int {
    val hashMap = HashMap<Char, Int>()
    hashMap['I'] = 1
    hashMap['V'] = 5
    hashMap['X'] = 10
    hashMap['L'] = 50
    hashMap['C'] = 100
    hashMap['D'] = 500
    hashMap['M'] = 1000
    var result: Int = 0
    var i = 0
    while (i < s.length) { // Changed to while loop
        val romanNumber = s[i]
        if (i < s.length - 1) {
            if (hashMap.containsKey(romanNumber)) {
                val nextRomanNumber = s[i + 1]
                if ((romanNumber == 'I' && (nextRomanNumber == 'V' || nextRomanNumber == 'X'))
                    || (romanNumber == 'X' && (nextRomanNumber == 'L' || nextRomanNumber == 'C'))
                    || (romanNumber == 'C' && (nextRomanNumber == 'D' || nextRomanNumber == 'M'))
                ) {
                    result += hashMap[nextRomanNumber]!! - hashMap[romanNumber]!!
                    i++
                } else {
                    result += hashMap[romanNumber]!!
                }
            }
        } else {
            result += hashMap[romanNumber]!!
        }
        i++

    }


    return result
}

