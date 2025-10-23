/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/solutions/7578526/check-if-digits-are-equal-in-string-afte-ngam
Problem      : 3461. Check If Digits Are Equal in String After Operations I
Day          : 23
Date         : 2025-10-23
*/

class Solution {
    fun hasSameDigits(s: String): Boolean {
        val ch = s.toCharArray()
        var k = ch.size - 1
        while (k != 1) {
            for (i in 0..<k) {
                val a = ch[i].code - 48
                val b = ch[i + 1].code - 48
                val d = (a + b) % 10
                val c = (d + '0'.code).toChar()
                ch[i] = c
            }
            k--
        }
        return ch[0] == ch[1]
    }
}
