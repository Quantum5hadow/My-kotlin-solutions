/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/add-binary/solutions/7580069/67-add-binary-easy-by-pixelprince-vlgh
Problem      : 67. Add Binary
Day          : 138
Date         : 2026-02-15
*/

class Solution {
    fun addBinary(a: String, b: String) =
        (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}
