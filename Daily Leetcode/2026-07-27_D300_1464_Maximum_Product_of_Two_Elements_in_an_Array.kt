/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/solutions/8428101/kotlin-easy-by-pixelprince-btsl
Problem      : 1464. Maximum Product of Two Elements in an Array
Day          : 300
Date         : 2026-07-27
*/

class Solution{
    fun maxProduct(n:IntArray)=n.sorted().run{(last()-1)*(get(lastIndex-1)-1)}
}