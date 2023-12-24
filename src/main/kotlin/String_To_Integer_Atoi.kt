fun main(args: Array<String>) {

    var a :String = "Alper+0100asda1212"
    println(myAtoi(a))
}

fun myAtoi(s: String): Int {
    var result = ""
    for (i in 0 until s.length){

        if (s[i].isDigit() || s[i] == '+'|| s[i] == '-'){
            result += s[i]
            //bir i döngüsü oluştur  buraya girince artsın
            if (i < s.length - 1 && !s[i+1].isDigit()){
                break
            }
        }
        //bir i döngüsü oluştur  buraya gelince azalsın
    }


    return result.toInt()
}