/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/complement-of-base-10-integer/solutions/7640794/kotlin-easy-by-pixelprince-8nyk
Problem      : 1009. Complement of Base 10 Integer
Day          : 162
Date         : 2026-03-11
*/

class Solution {
    fun bitwiseComplement(n: Int) =
        (n or 1).takeHighestOneBit() * 2 - n - 1
}


