/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/partition-array-according-to-given-pivot/submissions/2026146580
Problem      : 2161. Partition Array According to Given Pivot
Day          : 251
Date         : 2026-06-08
*/

class Solution{
    fun pivotArray(a:IntArray,p:Int)=
        (a.filter{it<p}+a.filter{it==p}+a.filter{it>p}).toIntArray()
}