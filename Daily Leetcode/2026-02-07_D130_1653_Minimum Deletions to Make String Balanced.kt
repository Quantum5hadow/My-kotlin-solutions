/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/solutions/7583460/minimum-deletions-to-make-string-balance-gt37
Problem      : 1653. Minimum Deletions to Make String Balanced
Day          : 130
Date         : 2026-02-07
*/

class Solution {
    fun minimumDeletions(s: String): Int {
        var b = 0; var a = 0
        for (c in s) if (c == 'b') b++ else a = minOf(a + 1, b)
        return a
    }
}

