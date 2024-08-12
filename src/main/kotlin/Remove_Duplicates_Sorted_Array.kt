fun main(args: Array<String>) {

    var a:IntArray = intArrayOf(1,1,2,2,3)
    removeDuplicates(a)
    println(removeDuplicates(a).toString())
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 0

    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }

    println(nums.joinToString())
    return i + 1
}

