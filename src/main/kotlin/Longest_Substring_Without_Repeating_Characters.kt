import kotlin.math.max

fun main(args: Array<String>) {
    var s:String = "abcabcbb"
    lengthOfLongestSubstring(s)

}

fun lengthOfLongestSubstring(s: String): Int {

    val hashMap = HashMap<Char, Int>()
    var windowStart = 0
    var longest = 0

    for (windowEnd in s.indices) {

        val ch = s[windowEnd]

        if (hashMap.contains(ch)) {
            windowStart = max(windowStart, hashMap[ch]?.plus(1) ?: 0)
        }
        hashMap[ch] = windowEnd
        longest = max(longest, windowEnd - windowStart + 1)
    }

    return longest
}