/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-binary-substrings/solutions/7591344/easy-by-pixelprince-1wdi
Problem      : 696. Count Binary Substrings
Day          : 142
Date         : 2026-02-18
*/

class Solution {
    fun countBinarySubstrings(s: String): Int {
        var ans = 0
        var prev = 0
        var cur = 1
        for (i in 1 until s.length)
            if (s[i] == s[i - 1]) cur++
            else { ans += minOf(prev, cur); prev = cur; cur = 1 }
        return ans + minOf(prev, cur)
    }
}
