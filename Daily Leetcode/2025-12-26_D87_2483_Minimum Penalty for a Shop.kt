/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-penalty-for-a-shop/solutions/7581779/minimum-penalty-for-a-shop-easy-by-pixel-472t
Problem     : 2483. Minimum Penalty for a Shop
Day         : 87
Date        : 2025-12-26
*/

class Solution {
    fun bestClosingTime(customers: String): Int {
        var cur = 0
        var max = 0
        var closeTime = 0

        for ((i, c) in customers.withIndex()) {
            cur += if (c == 'Y') 1 else -1
            if (cur > max) {
                max = cur
                closeTime = i + 1
            }
        }

        return closeTime
    }
}