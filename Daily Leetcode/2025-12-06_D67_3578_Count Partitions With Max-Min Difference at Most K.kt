/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-partitions-with-even-sum-difference/solutions/7581548/3578-count-partitions-with-max-min-diffe-nnti
Problem     : 3578. Count Partitions With Max-Min Difference at Most K

Day         : 67
Date        : 2025-12-06
*/

class Solution {
    fun countPartitions(nums: IntArray): Int {
        var ct = 0
        val n = nums.size
        for (i in 0..<n - 1) {
            var sum1 = 0
            var sum2 = 0
            for (j in 0..i) {
                sum1 += nums[j]
            }
            for (k in i + 1..<n) {
                sum2 += nums[k]
            }
            if (abs(sum1 - sum2) % 2 == 0) {
                ct++
            }
        }
        return ct
    }
}