/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/max-dot-product-of-two-subsequences/solutions/7581890/max-dot-product-of-two-subsequences-easy-uzbz
Problem     : 1458. Max Dot Product of Two Subsequences
Day         : 100
Date        : 2026-01-08
*/

class Solution {
    fun maxDotProduct(nums1: IntArray, nums2: IntArray): Int {
        val n = nums1.size
        val m = nums2.size
        val dp = Array(n) { IntArray(m) { Int.MIN_VALUE } }

        for (i in 0 until n) {
            for (j in 0 until m) {
                val prod = nums1[i] * nums2[j]
                dp[i][j] = prod
                if (i > 0 && j > 0) {
                    dp[i][j] = maxOf(dp[i][j], prod + dp[i - 1][j - 1])
                }
                if (i > 0) dp[i][j] = maxOf(dp[i][j], dp[i - 1][j])
                if (j > 0) dp[i][j] = maxOf(dp[i][j], dp[i][j - 1])
            }
        }
        return dp[n - 1][m - 1]
    }
}