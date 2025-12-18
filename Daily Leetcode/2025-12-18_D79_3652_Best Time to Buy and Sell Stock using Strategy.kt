/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-using-strategy/solutions/7581717/best-time-to-buy-and-sell-stock-using-st-1rti

Problem     : 3652. Best Time to Buy and Sell Stock using Strategy
Day         : 79
Date        : 2025-12-18

*/


class Solution {
    fun maxProfit(p: IntArray, s: IntArray, k: Int): Long {
        val n = p.size
        val p1 = LongArray(n + 1)
        val p2 = LongArray(n + 1)
        for (i in 0..<n) {
            p1[i + 1] = p1[i] + s[i].toLong() * p[i]
            p2[i + 1] = p2[i] + p[i]
        }
        var max: Long = 0
        for (i in 0..n - k) {
            val m = i + k / 2
            val e = i + k
            val op = p1[e] - p1[i]
            val np = p2[e] - p2[m]
            max = max(max, np - op)
        }
        return p1[n] + max
    }
}