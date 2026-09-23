/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/solutions/8535697/kotlin-easy-by-pixelprince-b62j
Problem      : 1658. Minimum Operations to Reduce X to Zero
Day          : 358
Date         : 2026-09-23
*/

class Solution {
    fun minOperations(nums: IntArray, x: Int): Int {
        val target = nums.sum() - x
        if (target < 0) return -1

        var sum = 0
        var left = 0
        var best = -1

        for (right in nums.indices) {
            sum += nums[right]
            while (sum > target) sum -= nums[left++]
            if (sum == target) best = maxOf(best, right - left + 1)
        }

        return if (best == -1) -1 else nums.size - best
    }
}