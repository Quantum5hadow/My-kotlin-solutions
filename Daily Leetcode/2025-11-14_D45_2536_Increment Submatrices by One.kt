/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/increment-submatrices-by-one/solutions/7579640/2536-increment-submatrices-by-one-easy-b-w2v4
Problem     : 2536. Increment Submatrices by One



Day         : 45
Date        : 2025-11-14
*/


class Solution {
    fun rangeAddQueries(n: Int, queries: Array<IntArray>): Array<IntArray> {
        val g = Array(n) { IntArray(n) }
        for (q in queries) {
            val r1 = q[0]
            val c1 = q[1]
            val r2 = q[2]
            val c2 = q[3]
            g[r1][c1]++
            if (c2 < n - 1) {
                g[r1][c2 + 1]--
            }
            if (r2 < n - 1) {
                g[r2 + 1][c1]--
            }
            if (c2 < n - 1 && r2 < n - 1) {
                g[r2 + 1][c2 + 1]++
            }
        }
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i > 0) {
                    g[i][j] += g[i - 1][j]
                }
                if (j > 0) {
                    g[i][j] += g[i][j - 1]
                }
                if (i > 0 && j > 0) {
                    g[i][j] -= g[i - 1][j - 1]
                }
            }
        }
        return g
    }
}