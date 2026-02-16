/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/reverse-bits/solutions/7583513/easy-by-pixelprince-pc24
Problem      : 190. Reverse Bits
Day          : 139
Date         : 2026-02-16
*/

class Solution {
    fun reverseBits(n: Int): Int {
        var x = n
        var r = 0
        repeat(32) {
            r = (r shl 1) or (x and 1)
            x = x ushr 1
        }
        return r
    }
}
