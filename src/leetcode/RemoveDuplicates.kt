package leetcode

fun main() {
    val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    //removeDuplicates(nums)
    // println(nums)

    removeDuplicates2(nums)
}

fun removeDuplicates(nums: IntArray): Int {
    return nums.toSet().size
}

fun removeDuplicates2(nums: IntArray): Int {
    var i =1
    for(k in 1..< nums.size){
        println("nums[k] = ${nums[k]} & ${nums[i-1]}")
        if(nums[k] != nums[i-1]){
            nums[i] = nums[k]
            i++
        }
    }
    return i
}