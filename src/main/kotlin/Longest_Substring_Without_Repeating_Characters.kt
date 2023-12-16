import kotlin.math.max

fun main(args: Array<String>) {
    var s:String = "pwwkew"
    lengthOfLongestSubstring2(s)

}

fun lengthOfLongestSubstring(s: String): Int {

    val hashMap = HashMap<Char, Int>()
    var windowStart = 0
    var longest = 0

    for (windowEnd in s.indices) {

        val ch = s[windowEnd]
        println(s[windowEnd])
        if (hashMap.contains(ch)) {
            windowStart = max(windowStart, hashMap[ch]?.plus(1) ?: 0)
        }
        hashMap[ch] = windowEnd //3
        longest = max(longest, windowEnd - windowStart + 1)
    }
    return longest
}


fun lengthOfLongestSubstring2(s: String): Int {
    var i = 0
    var j = 0
    var max = 0
    val  hashSet = mutableSetOf<Char>()
    while (i < s.length){
        if (!hashSet.contains(s[i])){
            hashSet.add(s[i])
            i++
            max = max(max, hashSet.size)
        }
        else{
            hashSet.remove(s[j])
            j++
        }
    }
    return max

}