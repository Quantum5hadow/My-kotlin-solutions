/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/solutions/8362939/kotlin-easy-by-pixelprince-u2qw
Problem      : 1846. Maximum Element After Decreasing and Rearranging
Day          : 271
Date         : 2026-06-28
*/

class Solution{
    fun maximumElementAfterDecrementingAndRearranging(a:IntArray):Int{
        a.sort()
        var x=0
        for(v in a)if(v>x)x++
        return x
    }
}