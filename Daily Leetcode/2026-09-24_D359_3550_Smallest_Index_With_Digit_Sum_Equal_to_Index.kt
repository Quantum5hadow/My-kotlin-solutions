/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/solutions/8538578/kotlin-easy-by-pixelprince-to0a
Problem      : 3550. Smallest Index With Digit Sum Equal to Index
Day          : 359
Date         : 2026-09-24
*/

class Solution{
    fun smallestIndex(a:IntArray)=
        a.indices.find{it==a[it].toString().sumOf(Char::digitToInt)}?:-1
}
