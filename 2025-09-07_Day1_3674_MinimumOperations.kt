// LeetCode ID: PixelPrince
// Profile: https://leetcode.com/u/PixelPrince/
// Problem: 3674. Minimum Operations to Equalize Array
// Day: 1
// Date: 2025-09-07
// Time: O(n)
// Space: O(1)

class Solution {
    fun minOperations(nums: IntArray) =
        if (nums.all { it == nums[0] }) 0 else 1
}
