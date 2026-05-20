/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/solutions/8279250/kotlin-easy-by-pixelprince-4ke8
Problem      : 2657. Find the Prefix Common Array of Two Arrays
Day          : 232
Date         : 2026-05-20
*/

class Solution{
    fun findThePrefixCommonArray(a:IntArray,b:IntArray)=
        IntArray(a.size){i->a.take(i+1).intersect(b.take(i+1)).size}
}