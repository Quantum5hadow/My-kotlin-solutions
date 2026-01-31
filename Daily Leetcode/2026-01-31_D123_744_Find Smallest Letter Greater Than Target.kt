/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-smallest-letter-greater-than-target/solutions/7583422/find-smallest-letter-greater-than-target-o3fw
Problem      : 744. Find Smallest Letter Greater Than Target
Day          : 123
Date         : 2026-01-31
*/

class Solution {
    fun nextGreatestLetter(a: CharArray, t: Char): Char {
        var l = 0
        var r = a.lastIndex
        if (a[r] <= t) return a[0]
        while (l < r) {
            val m = (l + r) ushr 1
            if (a[m] <= t) l = m + 1 else r = m
        }
        return a[l]
    }
}