fun main(args: Array<String>) {

    var numberList : IntArray = intArrayOf(2,7,11,15)

    twoSum(numberList, 9)
    println(twoSum(numberList, 9).joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap : HashMap<Int,Int> = hashMapOf()

    for (i in 0.. nums.size){
    val kalan : Int = target - nums[i]
        if (hashMap.contains(kalan)){
            return intArrayOf(hashMap[kalan]!!,i)
        }
        hashMap[nums[i]] = i
    }
    throw IllegalStateException("no pair found")
}
