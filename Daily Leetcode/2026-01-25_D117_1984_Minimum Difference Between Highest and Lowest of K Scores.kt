/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/solutions/7583387/minimum-difference-between-highest-and-l-9jvf
Problem      : 1984. Minimum Difference Between Highest and Lowest of K Scores
Day          : 117
Date         : 2026-01-25
*/

class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        var ans = Int.MAX_VALUE
        for (i in 0..nums.size - k) {
            ans = minOf(ans, nums[i + k - 1] - nums[i])
        }
        return ans
    }
}
