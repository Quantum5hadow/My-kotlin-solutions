/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/solutions/7607613/easy-one-line-by-pixelprince-yn9q
Problem      : 1356. Sort Integers by The Number of 1 Bits
Day          : 148
Date         : 2026-02-25
*/
class Solution{
    fun sortByBits(a:IntArray)=
        a.sortedWith(compareBy<Int>{it.countOneBits()}.thenBy{it}).toIntArray()
}
