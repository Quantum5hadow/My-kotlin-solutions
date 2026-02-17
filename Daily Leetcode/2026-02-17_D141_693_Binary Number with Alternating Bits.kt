/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/binary-number-with-alternating-bits/solutions/7588625/binary-number-with-alternating-bits-ll-e-ffxj
Problem      : 693. Binary Number with Alternating Bits
Day          : 141
Date         : 2026-02-17
*/

class Solution {
    fun hasAlternatingBits(n: Int) =
        (n and (n shr 1)) == 0 && 
        (n and (n shr 2)) == (n shr 2)
}
