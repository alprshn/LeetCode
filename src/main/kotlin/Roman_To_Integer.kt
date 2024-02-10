fun main(args: Array<String>) {

    var a = romanToInt("IIIX")
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



    var i = 0
    while (i < s.length) { // Changed to while loop
        val romanNumber = s[i]
        if (hashMap.contains(romanNumber)) {
            var number = 0
            if (s[i] == 'I' && (s[i+1] == 'V'|| s[i+1] == 'X')){
                number = hashMap[s[i+1]]?.minus(hashMap[romanNumber]!!)!!
                result += number
                i += 1
            }
            if (s[i] == 'X' && (s[i+1] == 'L'|| s[i+1] == 'C')){
                number = hashMap[s[i+1]]?.minus(hashMap[romanNumber]!!)!!
                result += number
                i += 1
            }
            if (s[i] == 'C' && (s[i+1] == 'D'|| s[i+1] == 'M')){
                number = hashMap[s[i+1]]?.minus(hashMap[romanNumber]!!)!!
                result += number
                i += 1
            }
            else{
                result += hashMap[romanNumber]!!
            }

        }

        i++
    }


    return result
}

