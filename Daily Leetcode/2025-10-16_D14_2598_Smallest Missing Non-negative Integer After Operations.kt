/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/solutions/7576891/smallest-missing-non-negative-integer-af-7qzi/?envType=daily-question&envId=2025-10-16

Problem     : 2598. Smallest Missing Non-negative Integer After Operations

Day         : 14
Date        : 2025-10-14
*/

class Solution {
    fun findSmallestInteger(nums: IntArray, value: Int): Int {
        val n = nums.size
        if (value == 1) return n
        val a = IntArray(value)
        for (i in 0 until n) {
            var k = nums[i] % value
            if (k < 0) k = (value + k) % value
            a[k]++
        }
        val mins = mins(a)
        val min = mins[0]
        val minIndex = mins[1]
        return min * value + minIndex
    }

    private fun mins(a: IntArray): IntArray {
        val n = a.size
        var min = 100001
        var minIndex = -1
        for (i in 0 until n) {
            if (a[i] < min) {
                min = a[i]
                minIndex = i
            }
        }
        return intArrayOf(min, minIndex)
    }
}