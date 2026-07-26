/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-product-of-three-numbers/solutions/8421500/kotlin-easy-by-pixelprince-j01m
Problem      : 628. Maximum Product of Three Numbers
Day          : 299
Date         : 2026-07-26
*/

class Solution {
    fun maximumProduct(n: IntArray): Int {
        n.sort()
        return maxOf(
            n[0] * n[1] * n.last(),
            n.takeLast(3).reduce(Int::times)
        )
    }
}