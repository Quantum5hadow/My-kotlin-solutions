
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/solutions/7581697/2110-number-of-smooth-descent-periods-of-4s23
Problem     : 2110. Number of Smooth Descent Periods of a Stock
Day         : 76
Date        : 2025-12-15
*/

class Solution {
    fun getDescentPeriods(prices: IntArray): Long {
        var descendantCount: Long = 0
        var previousCounts = 0
        for (i in 0 until prices.size - 1) {
            if (prices[i] - prices[i + 1] == 1) {
                descendantCount++
                if (previousCounts > 0) {
                    descendantCount += previousCounts.toLong()
                }
                previousCounts++
            } else {
                previousCounts = 0
            }
        }
        descendantCount += prices.size.toLong()
        return descendantCount
    }
}