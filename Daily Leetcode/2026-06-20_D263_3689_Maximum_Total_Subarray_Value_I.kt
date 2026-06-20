/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-total-subarray-value-i/solutions/8346733/kotlin-easy-by-pixelprince-hqf1
Problem      : 3689. Maximum Total Subarray Value I
Day          : 263
Date         : 2026-06-20
*/

class Solution{
    fun maxTotalValue(a:IntArray,k:Int)=
        (a.maxOrNull()!!-a.minOrNull()!!).toLong()*k
}