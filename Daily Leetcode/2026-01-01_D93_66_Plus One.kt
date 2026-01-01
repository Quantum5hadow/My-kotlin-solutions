/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/plus-one/solutions/7581831/66-plus-one-easy-by-pixelprince-6kgv

Problem     : 66. Plus One
Day         : 93
Date        : 2026-01-01
*/

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1

        for (i in digits.lastIndex downTo 0) {
            val sum = digits[i] + carry
            digits[i] = sum % 10
            carry = sum / 10
            if (carry == 0) break
        }

        if (carry == 0) return digits

        val res = IntArray(digits.size + 1)
        res[0] = 1
        return res
    }
}
