fun main(args: Array<String>) {

    var a: String = "42"
    println(myAtoi(a))
}

fun myAtoi(s: String): Int {
    var result = ""
    if (s.isEmpty() || s.length == 1 && !s[0].isDigit()) return 0

    if (s[0].isDigit() || (s[0] == ' ' || s[0] == '+' || s[0] == '-')) {
        for (i in 0 until s.length) {
            if ((s[i] == '+' && (i < s.length - 1 && (s[i + 1] == '-' || !s[i + 1].isDigit()))) ||
                (s[i] == '-' && (i < s.length - 1 && (s[i + 1] == '+' || !s[i + 1].isDigit()))) ||
                (s[i] == '-' && (i < s.length - 1 && (s[i + 1] == '-' || !s[i + 1].isDigit()))) ||
                (s[i] == '+' && (i < s.length - 1 && (s[i + 1] == '+') || !s[i + 1].isDigit()))) {
                return 0
            }
            if (s[i].isDigit() || s[i] == '+' || s[i] == '-') {
                result += s[i]
                //bir i döngüsü oluştur  buraya girince artsın
                if (i < s.length - 1 && !s[i + 1].isDigit()) {
                    break
                }
            }


            //bir i döngüsü oluştur  buraya gelince azalsın
        }
    } else {
        return 0
    }
    if (result.isNotEmpty()) {
        try {
            // Check if the result is within the valid range for integers
            return result.toInt()
        } catch (e: NumberFormatException) {
            // Handle the case where the conversion exceeds the integer range
            if (result[0] == '-') {
                return Int.MIN_VALUE
            }
            if (result[0] == '+' || result[0].isDigit()) {
                return Int.MAX_VALUE
            } else {
                return 0
            }
        }
    }
    else{
        return 0
    }
}