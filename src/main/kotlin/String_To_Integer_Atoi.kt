fun main(args: Array<String>) {

    val a: String = " b11228552307"
    //println(a.trim())
    println(myAtoi(a))
}

fun myAtoi(s: String): Int {
    val s = s.trim()
    if(s.isEmpty()){
        return 0
    }
    var start = if(s[0] =='-' || s[0]=='+') {
        1
    } else {
        0
    }
    if(start !in s.indices || !s[start].isDigit()){
        return 0
    }
    var end = start
    while(end + 1 in s.indices) {
        if(!s[end + 1].isDigit()){
            break
        }
        end++
    }
    var currentNumber = s.substring(start, end+1).toBigInteger()
    val max = Int.MAX_VALUE
    val min = Int.MIN_VALUE
    var isSignPresent = if(s[0] == '-' || s[0] =='+') true else false
    return when{
        !isSignPresent -> {
            if(currentNumber > max.toBigInteger()) {
                2147483648 - 1
            } else {
                currentNumber.toInt()
            }
        }
        else -> {
            if(currentNumber > max.toBigInteger()){
                if(s[0] =='+') {
                    2147483648 - 1
                } else {
                    Int.MIN_VALUE
                }
            } else {
                var sign = if(s[0] =='-') -1 else 1
                sign * currentNumber.toInt()
            }
        }
    }
}