/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-product-of-two-digits/solutions/8418146/kotlin-easy-by-pixelprince-houi
Problem      : 3536. Maximum Product of Two Digits
Day          : 298
Date         : 2026-07-25
*/

class Solution {
    fun maxProduct(n: Int): Int {
        var n = n
        var a = 0
        var b = 0
        while (n > 0) {
            val d = n % 10
            if (d >= a) a.also { b = it }.also { a = d }
            else if (d > b) b = d
            n /= 10
        }
        return a * b
    }
}