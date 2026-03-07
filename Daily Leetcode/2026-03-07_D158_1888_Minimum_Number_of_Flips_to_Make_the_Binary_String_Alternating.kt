/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/submissions/1940372701
Problem      : 1888. Minimum Number of Flips to Make the Binary String Alternating
Day          : 158
Date         : 2026-03-07
*/

class Solution {
    fun minFlips(s: String): Int {
        val n = s.length
        val t = s + s
        var a = 0
        var b = 0
        var ans = n
        for (i in t.indices) {
            if (t[i] != if (i % 2 == 0) '0' else '1') a++
            if (t[i] != if (i % 2 == 0) '1' else '0') b++
            if (i >= n) {
                val j = i - n
                if (t[j] != if (j % 2 == 0) '0' else '1') a--
                if (t[j] != if (j % 2 == 0) '1' else '0') b--
            }
            if (i >= n - 1) ans = minOf(ans, a, b)
        }
        return ans
    }
}