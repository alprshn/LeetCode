import kotlin.math.max

fun main(args: Array<String>) {
    var nums1 : IntArray = intArrayOf(1,2)
    var nums2 : IntArray = intArrayOf(3,4)


}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {


    return -1.0
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