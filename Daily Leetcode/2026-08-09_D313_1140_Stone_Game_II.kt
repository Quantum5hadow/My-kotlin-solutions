/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game-ii/solutions/8450336/kotlin-easy-by-pixelprince-tk5v
Problem      : 1140. Stone Game II
Day          : 313
Date         : 2026-08-09
*/

class Solution {
    fun stoneGameII(a: IntArray): Int {
        val n = a.size
        val s = IntArray(n + 1)
        for (i in n - 1 downTo 0) s[i] = s[i + 1] + a[i]
        val d = Array(n) { IntArray(n + 1) }
        fun f(i: Int, m: Int): Int {
            if (i == n) return 0
            if (d[i][m] > 0) return d[i][m]
            for (j in i until minOf(n, i + 2 * m))
                d[i][m] = maxOf(d[i][m], s[i] - f(j + 1, maxOf(m, j - i + 1)))
            return d[i][m]
        }
        return f(0, 1)
    }
}