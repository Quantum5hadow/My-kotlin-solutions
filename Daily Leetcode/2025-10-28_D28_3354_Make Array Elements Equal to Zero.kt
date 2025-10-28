/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/make-array-elements-equal-to-zero/solutions/7577135/make-array-elements-equal-to-zero-by-pix-d9fv

Problem     : 3354. Make Array Elements Equal to Zero


Day         : 28
Date        : 2025-10-28
*/



import kotlin.math.abs

class Solution {
    fun countValidSelections(nums: IntArray): Int {
        val rightSum = IntArray(nums.size)
        val leftSum = IntArray(nums.size)
        var result = 0
        leftSum[0] = 0
        rightSum[nums.size - 1] = 0
        for (i in 1..<nums.size) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1]
        }
        for (j in nums.size - 2 downTo 0) {
            rightSum[j] = rightSum[j + 1] + nums[j + 1]
        }
        for (k in nums.indices) {
            if (nums[k] == 0 && abs((rightSum[k] - leftSum[k])) == 1) {
                result++
            }
            if (nums[k] == 0 && abs((rightSum[k] - leftSum[k])) == 0) {
                result += 2
            }
        }
        return result
    }
}