/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/ones-and-zeroes/solutions/7578694/easy-by-pixelprince-e8z0
Problem     : 474. Ones and Zeroes



Day         : 42
Date        : 2025-11-11
*/


class Solution {
      fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (str in strs) {
            val count = count(str)
            for (i in m downTo count[0]) {
                for (j in n downTo count[1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - count[0]][j - count[1]] + 1)
                }
            }
        }
        return dp[m][n]
    }

    private fun count(str: String): IntArray {
        val res = IntArray(2)
        for (i in 0 until str.length) {
            res[str[i].code - '0'.code]++
        }
        return res
    }
}