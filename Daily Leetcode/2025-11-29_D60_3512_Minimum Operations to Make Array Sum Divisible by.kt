/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/solutions/7581483/3512-minimum-operations-to-make-array-su-ms16
Problem     : 3512. Minimum Operations to Make Array Sum Divisible by

Day         : 60
Date        : 2025-11-29
*/


class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        return sum % k
    }
}