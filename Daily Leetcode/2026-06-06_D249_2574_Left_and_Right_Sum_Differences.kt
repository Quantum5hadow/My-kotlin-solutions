/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/left-and-right-sum-differences/solutions/8317019/kotlin-easy-by-pixelprince-xm9c
Problem      : 2574. Left and Right Sum Differences
Day          : 249
Date         : 2026-06-06
*/

class Solution{
    fun leftRightDifference(a:IntArray):IntArray{
        val s=a.sum();var l=0
        return a.map{l+=it;kotlin.math.abs(2*l-it-s)}.toIntArray()
    }
}