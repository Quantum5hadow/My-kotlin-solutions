
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-partitions-with-even-sum-difference/solutions/7581540/3432-count-partitions-with-even-sum-diff-5ajh
Problem     : 3432. Count Partitions with Even Sum Difference

Day         : 66
Date        : 2025-12-05
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