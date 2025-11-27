/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-subarray-sum-with-length-divisible-by-k/solutions/7581464/3381-maximum-subarray-sum-with-length-di-t3a5
Problem     : 3381. Maximum Subarray Sum With Length Divisible by K

Day         : 58
Date        : 2025-11-27
*/



class Solution {
    fun maxSubarraySum(nums: IntArray, k: Int): Long {
        val n = nums.size
        val maxSum = LongArray(n)
        var minSum: Long = 0
        for (i in n - 1 downTo n - k + 1) {
            maxSum[i] = Int.Companion.MIN_VALUE.toLong()
            minSum += nums[i]
        }
        minSum += nums[n - k]
        maxSum[n - k] = minSum
        var ans = minSum
        for (i in n - k - 1 downTo 0) {
            minSum = minSum + nums[i] - nums[i + k]
            maxSum[i] = max(minSum, (minSum + maxSum[i + k]))
            ans = max(maxSum[i], ans)
        }
        return ans
    }
}