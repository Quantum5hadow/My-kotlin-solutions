/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/solutions/7582054/minimum-ascii-delete-sum-for-two-strings-ermv
Problem      : 712. Minimum ASCII Delete Sum for Two Strings
Day          : 103
Date         : 2026-01-11
*/

class Solution {
    fun minimumDeleteSum(s1: String, s2: String): Int {
        val n = s1.length
        val m = s2.length
        val dp = Array(n + 1) { IntArray(m + 1) }

        for (i in 1..n) dp[i][0] = dp[i - 1][0] + s1[i - 1].code
        for (j in 1..m) dp[0][j] = dp[0][j - 1] + s2[j - 1].code

        for (i in 1..n) {
            for (j in 1..m) {
                dp[i][j] =
                    if (s1[i - 1] == s2[j - 1]) dp[i - 1][j - 1]
                    else minOf(
                        dp[i - 1][j] + s1[i - 1].code,
                        dp[i][j - 1] + s2[j - 1].code
                    )
            }
        }
        return dp[n][m]
    }
}
