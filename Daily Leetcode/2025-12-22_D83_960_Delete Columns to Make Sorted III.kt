/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/delete-columns-to-make-sorted-iii/solutions/7581755/delete-columns-to-make-sorted-iii-easy-b-i64e
Problem     : 960. Delete Columns to Make Sorted III
Day         : 83
Date        : 2025-12-22
*/





class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        val n = strs[0].length
        val dp = Array(n + 1) { IntArray(2) }
        for (i in 1..n) {
            dp[i][0] = 1 + dp[i - 1][0].coerceAtMost(dp[i - 1][1])
            var min = i - 1
            var j: Int = i - 1
            while (j > 0) {
                var lexico = true
                for (str in strs) {
                    if (str[i - 1] < str[j - 1]) {
                        lexico = false
                        break
                    }
                }
                if (lexico) {
                    min = min.coerceAtMost(dp[j][1] + i - j - 1)
                }
                j--
            }
            dp[i][1] = min
        }
        return dp[n][0].coerceAtMost(dp[n][1])
    }
}