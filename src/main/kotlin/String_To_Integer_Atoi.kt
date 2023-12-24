fun main(args: Array<String>) {

    var a :String = "Alper100"
    myAtoi(a)
}

fun myAtoi(s: String): Int {
    var result = ""
    for (i in s){
        if (i.isDigit()){
            result += i
        }
    }
    println(result)
    return 0
}