import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var nums1 : IntArray = intArrayOf(1,2)
    var nums2 : IntArray = intArrayOf(3,4,7,6)
    findMedianSortedArrays(nums1,nums2)

}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

    val a = nums1 + nums2
    a.sort()
    if (a.size%2 == 0){
        var c:Double = ((a.size /2)-1).toDouble()
        var z: Double = (a[c.toInt()] + a[(c + 1.0).toInt()]) / 2.0
        return z
    }
     else{
        var f:Int = ((a.size /2))
        var g: Double = a[f].toDouble()
        return g
    }

}


