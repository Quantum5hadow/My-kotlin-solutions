/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-cost-to-convert-string-i/solutions/7583411/minimum-cost-to-convert-string-i-easy-by-q0fs
Problem      : 2976. Minimum Cost to Convert String I
Day          : 121
Date         : 2026-01-29
*/

class Solution {
    fun minimumCost(s: String, t: String, o: CharArray, c: CharArray, ct: IntArray): Long {
        val INF = 1L shl 60
        val d = Array(26) { i -> LongArray(26) { if (i == it) 0 else INF } }

        for (i in o.indices) {
            val a = o[i] - 'a'
            val b = c[i] - 'a'
            d[a][b] = minOf(d[a][b], ct[i].toLong())
        }

        for (k in 0 until 26)
            for (i in 0 until 26)
                for (j in 0 until 26)
                    d[i][j] = minOf(d[i][j], d[i][k] + d[k][j])

        var ans = 0L
        for (i in s.indices) {
            val v = d[s[i] - 'a'][t[i] - 'a']
            if (v >= INF) return -1
            ans += v
        }
        return ans
    }
}