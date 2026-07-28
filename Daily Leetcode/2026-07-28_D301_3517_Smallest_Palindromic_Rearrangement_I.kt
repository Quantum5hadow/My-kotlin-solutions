/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-palindromic-rearrangement-i/solutions/8426417/kotlin-easy-by-pixelprince-fxvz
Problem      : 3517. Smallest Palindromic Rearrangement I
Day          : 301
Date         : 2026-07-28
*/

class Solution {
    fun smallestPalindrome(s: String): String {
        val c = s.take(s.length / 2).toCharArray()
        c.sort()
        return buildString {
            append(c)
            if (s.length and 1 == 1) append(s[s.length / 2])
            for (i in c.lastIndex downTo 0) append(c[i])
        }
    }
}