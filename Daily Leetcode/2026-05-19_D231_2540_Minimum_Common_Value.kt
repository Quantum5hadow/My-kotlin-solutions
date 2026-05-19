/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-common-value/solutions/8276435/kotlin-easy-by-pixelprince-7v6q
Problem      : 2540. Minimum Common Value
Day          : 231
Date         : 2026-05-19
*/

class Solution{
    fun getCommon(a:IntArray,b:IntArray)=
        a.firstOrNull{b.binarySearch(it)>=0}?:-1
}