/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/solutions/7583365/minimum-pair-removal-to-sort-array-i-eas-a9at
Problem      : 3507. Minimum Pair Removal to Sort Array I
Day          : 114
Date         : 2026-01-22
*/

class Solution {
    fun minimumPairRemoval(nums: IntArray): Int {
        val a = nums.toMutableList()
        var ops = 0

        fun ok(): Boolean {
            for (i in 1 until a.size) if (a[i] < a[i - 1]) return false
            return true
        }

        while (!ok()) {
            var best = Int.MAX_VALUE
            var idx = 0
            for (i in 0 until a.size - 1) {
                val s = a[i] + a[i + 1]
                if (s < best) {
                    best = s
                    idx = i
                }
            }
            a[idx] = a[idx] + a[idx + 1]
            a.removeAt(idx + 1)
            ops++
        }
        return ops
    }
}