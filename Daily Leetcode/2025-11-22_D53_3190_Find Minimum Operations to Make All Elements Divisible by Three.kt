/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/solutions/7581335/find-minimum-operations-to-make-all-elem-h65i

Day         : 53
Date        : 2025-11-22
*/


class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] % 3 != 0) {
                count++
            }
        }
        return count
    }
}