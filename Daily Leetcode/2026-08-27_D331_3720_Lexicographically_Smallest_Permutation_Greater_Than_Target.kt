/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/solutions/8487276/kotlin-easy-by-pixelprince-xhio
Problem      : 3720. Lexicographically Smallest Permutation Greater Than Target
Day          : 331
Date         : 2026-08-27
*/

class Solution {
    fun lexGreaterPermutation(s: String, t: String): String {
        val cnt = IntArray(26)
        for (c in s) cnt[c - 'a']++

        var bestPos = -1
        var bestChar = 0
        var bestSnapshot: IntArray? = null

        for (i in t.indices) {
            val target = t[i] - 'a'
            val next = (target + 1 until 26).firstOrNull { cnt[it] > 0 }

            if (next != null) {
                cnt[next]--
                bestPos = i
                bestChar = next
                bestSnapshot = cnt.copyOf()
                cnt[next]++
            }

            if (cnt[target] == 0) break
            cnt[target]--
        }

        if (bestPos == -1) return ""

        val res = StringBuilder()
        res.append(t, 0, bestPos)
        res.append('a' + bestChar)
        for (c in 0..25) repeat(bestSnapshot!![c]) { res.append('a' + c) }
        return res.toString()
    }
}