
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-cost-to-convert-string-ii/solutions/7583418/minimum-cost-to-convert-string-ii-easy-b-16vl
Problem      : 2977. Minimum Cost to Convert String II
Day          : 122
Date         : 2026-01-30
*/

class Solution {
    fun minimumCost(
        s: String,
        t: String,
        o: Array<String>,
        c: Array<String>,
        cost: IntArray
    ): Long {
        val all = (o.asList() + c.asList()).toSet().toList()
        val id = all.withIndex().associate { it.value to it.index }
        val n = all.size
        val INF = 1L shl 60

        val d = Array(n) { LongArray(n) { INF } }
        for (i in 0 until n) d[i][i] = 0
        for (i in o.indices)
            d[id[o[i]]!!][id[c[i]]!!] =
                minOf(d[id[o[i]]!!][id[c[i]]!!], cost[i].toLong())

        for (k in 0 until n)
            for (i in 0 until n)
                for (j in 0 until n)
                    d[i][j] = minOf(d[i][j], d[i][k] + d[k][j])

        val dp = LongArray(s.length + 1) { INF }
        dp[0] = 0
        val lens = all.map { it.length }.toSet()

        for (i in s.indices) {
            if (dp[i] >= INF) continue
            if (s[i] == t[i]) dp[i + 1] = minOf(dp[i + 1], dp[i])
            for (l in lens) {
                val j = i + l
                if (j > s.length) continue
                val u = id[s.substring(i, j)] ?: continue
                val v = id[t.substring(i, j)] ?: continue
                dp[j] = minOf(dp[j], dp[i] + d[u][v])
            }
        }
        return if (dp[s.length] >= INF) -1 else dp[s.length]
    }
}