import java.awt.List

fun main(args: Array<String>) {
    var array: IntArray = intArrayOf(2,1,5,1,3,2)
    SubArrayBruteForce(array, 3)
}

fun SubArrayBruteForce(nums: IntArray, target: Int): Int {
    var sum : Int = 0
    var fakeSum: Int = 0
    for (i in 0 .. nums.size-target){ // i= 3
        fakeSum = 0
        for (j in i until  i+target){ // j = 3  ---- i+ target =6
            fakeSum += nums[j]//6
        }
        //println(fakeSum)


        if (fakeSum > sum){
            sum = fakeSum
        }
    }
    println(sum)
    return sum
    //throw InterruptedException("no pair found")
}
