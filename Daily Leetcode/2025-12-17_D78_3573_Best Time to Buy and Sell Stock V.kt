/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-v/solutions/7581707/best-time-to-buy-and-sell-stock-v-easy-b-gn4m
Problem     : 3573. Best Time to Buy and Sell Stock V
Day         : 78
Date        : 2025-12-17

*/


class Solution {
    fun maximumProfit(prices: IntArray, k: Int): Long {
        val n = prices.size
        var prev = LongArray(n)
        var curr = LongArray(n)
        for (t in 1..k) {
            var bestLong = -prices[0].toLong()
            var bestShort = prices[0].toLong()
            curr[0] = 0
            for (i in 1..<n) {
                var res = curr[i - 1]
                res = max(res, prices[i] + bestLong)
                res = max(res, -prices[i] + bestShort)
                curr[i] = res
                bestLong = max(bestLong, prev[i - 1] - prices[i])
                bestShort = max(bestShort, prev[i - 1] + prices[i])
            }
            val tmp = prev
            prev = curr
            curr = tmp
        }
        return prev[n - 1]
    }
}