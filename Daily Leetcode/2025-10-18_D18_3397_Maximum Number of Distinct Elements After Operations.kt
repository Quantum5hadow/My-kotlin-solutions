/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations/solutions/7578575/maximum-number-of-distinct-elements-afte-ogsb

Problem     : 3397. Maximum Number of Distinct Elements After Operations


Day         : 18
Date        : 2025-10-18
*/

import kotlin.math.max

class Solution {
    fun maxDistinctElements(nums: IntArray, k: Int): Int {
        nums.sort()
        var next = nums[0] - k + 1
        val n = nums.size
        var ans = 1
        for (i in 1..<n) {
            if (nums[i] + k < next) {
                continue
            }
            next = max(next, (nums[i] - k))
            ans++
            next++
        }
        return ans
    }
}