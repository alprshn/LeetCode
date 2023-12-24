fun main(args: Array<String>) {

    var a :String = "Alper100asda1212"
    myAtoi(a)
}

fun myAtoi(s: String): Int {
    var result = ""
    for (i in 0 until s.length){

        if (s[i].isDigit()){
            result += s[i]
            //bir i döngüsü oluştur  buraya girince artsın
            if (!s[i+1].isDigit()){
                break
            }
        }
        //bir i döngüsü oluştur  buraya gelince azalsın
    }
    println(result)
    return 0
}