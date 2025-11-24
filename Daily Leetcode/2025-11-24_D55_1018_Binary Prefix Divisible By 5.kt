/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/binary-prefix-divisible-by-5/solutions/7581356/1018-binary-prefix-divisible-by-5-easy-b-3tii
Day         : 55
Date        : 2025-11-24
Problem     : 1018. Binary Prefix Divisible By 5
*/


class Solution {
    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
        val result: MutableList<Boolean> = ArrayList(nums.size)
        var remainder = 0
        for (j in nums) {
            remainder = (j + (remainder shl 1)) % 5
            result.add(remainder == 0)
        }
        return result
    }
}