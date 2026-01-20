/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/solutions/7583349/construct-the-minimum-bitwise-array-i-ea-uhbc
Problem      : 3314. Construct the Minimum Bitwise Array I
Day          : 112
Date         : 2026-01-20
*/

class Solution {
    fun minBitwiseArray(nums: List<Int>): IntArray {
        val res = IntArray(nums.size)
        for (i in nums.indices) {
            res[i] = solve(nums[i])
        }
        return res
    }

    private fun solve(v: Int): Int {
        if (v % 2 == 0) return -1
        for (j in 0 until v) {
            if ((j or (j + 1)) == v) return j
        }
        return -1
    }
}

