
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/detect-cycles-in-2d-grid/solutions/8098157/kotlin-easy-by-pixelprince-swa8
Problem      : 1559. Detect Cycles in 2D Grid
Day          : 208
Date         : 2026-04-26


class Solution {
    fun containsCycle(g: Array<CharArray>): Boolean {
        val n = g.size
        val m = g[0].size
        val vis = Array(n) { BooleanArray(m) }

        fun dfs(i: Int, j: Int, pi: Int, pj: Int): Boolean {
            if (vis[i][j]) return true
            vis[i][j] = true
            val d = intArrayOf(0,1,0,-1,0)
            for (k in 0..3) {
                val ni = i + d[k]
                val nj = j + d[k+1]
                if (ni in 0 until n && nj in 0 until m &&
                    g[ni][nj] == g[i][j] && !(ni == pi && nj == pj)) {
                    if (dfs(ni, nj, i, j)) return true
                }
            }
            return false
        }

        for (i in 0 until n)
            for (j in 0 until m)
                if (!vis[i][j] && dfs(i, j, -1, -1)) return true

        return false
    }
}