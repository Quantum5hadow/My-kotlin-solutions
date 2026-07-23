/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-unique-xor-triplets-i/solutions/8415488/kotlin-easy-by-pixelprince-519d
Problem      : 3513. Number of Unique XOR Triplets I
Day          : 296
Date         : 2026-07-23
*/

class Solution {
    fun uniqueXorTriplets(nums: IntArray) =
        if (nums.size < 3) nums.size else 1 shl nums.size.bitLength()
}

private fun Int.bitLength() = 32 - countLeadingZeroBits()