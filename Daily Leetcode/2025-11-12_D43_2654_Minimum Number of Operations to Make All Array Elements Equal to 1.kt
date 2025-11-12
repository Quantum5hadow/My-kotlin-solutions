/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/solutions/7579612/2654-minimum-number-of-operations-to-mak-6fth
Problem     : 2654. Minimum Number of Operations to Make All Array Elements Equal to 1



Day         : 43
Date        : 2025-11-12
*/


class Solution {
    fun minOperations(nums: IntArray): Int {
        var g = nums[0]
        var list = mutableListOf<Int>()
        var padding = 0
        var result = nums.size
        for (i in 0 until nums.size) {
            val n = nums[i]
            if (n == 1) {
                result--
            }
            g = gcd(g, n)
            if (i == nums.size - 1) continue
            val m = nums[i + 1]
            list.add(gcd(m, n))
        }
        if (g > 1) return -1
        while (!list.any { it == 1 }) {
            padding++
            val nlist = mutableListOf<Int>()
            for (i in 0 until list.size - 1) {
                val n = list[i]
                val m = list[i + 1]
                nlist.add(gcd(m, n))
            }
            list = nlist
        }
        return result + padding
    }

    private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a
}