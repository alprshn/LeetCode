fun main(args: Array<String>) {

    var numberList : IntArray = intArrayOf(2,7,11,15)

    twoSum(numberList, 9)
    println(twoSum(numberList, 9).joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var result : IntArray = intArrayOf()
    for (i in 0..nums.size-1){
        for (j in 0..nums.size-1){
            if (nums[i]+ nums[j] == target && i != j){
                if (!result.contains(i) && result.contains(j))
                result = addElement(result, i)
                result = addElement(result, j)
            }
        }
    }
    return result
}


fun addElement(arr: IntArray, element: Int): IntArray {
    val mutableArray = arr.toMutableList()
    mutableArray.add(element)
    return mutableArray.toIntArray()
}
