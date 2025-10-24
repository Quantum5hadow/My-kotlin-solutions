/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/next-greater-numerically-balanced-number/solutions/7578505/next-greater-numerically-balanced-number-0e1m

Problem     : 2048. Next Greater Numerically Balanced Number



Day         : 24
Date        : 2025-10-24
*/


class Solution {
    fun nextBeautifulNumber(n: Int): Int {
        val arr = intArrayOf(0, 1, 2, 3, 4, 5, 6)
        val select = BooleanArray(7)
        val d = if (n == 0) 1 else Math.log10(n.toDouble()).toInt() + 1
        return solve(1, n, d, 0, select, arr)
    }

    private fun solve(i: Int, n: Int, d: Int, sz: Int, select: BooleanArray, arr: IntArray): Int {
        if (sz > d + 1) {
            return Int.MAX_VALUE
        }
        if (i == select.size) {
            return if (sz >= d) make(0, n, sz, select, arr) else Int.MAX_VALUE
        }
        var ans = solve(i + 1, n, d, sz, select, arr)
        select[i] = true
        ans = Math.min(ans, solve(i + 1, n, d, sz + i, select, arr))
        select[i] = false
        return ans
    }

    private fun make(cur: Int, n: Int, end: Int, select: BooleanArray, arr: IntArray): Int {
        if (end == 0) {
            return if (cur > n) cur else Int.MAX_VALUE
        }
        var ans = Int.MAX_VALUE
        for (j in 1 until arr.size) {
            if (!select[j] || arr[j] == 0) {
                continue
            }
            --arr[j]
            ans = Math.min(make(10 * cur + j, n, end - 1, select, arr), ans)
            ++arr[j]
        }
        return ans
    }
}