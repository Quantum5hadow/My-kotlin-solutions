/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/reverse-degree-of-a-string/solutions/8532115/kotlin-easy-by-pixelprince-7o0v
Problem      : 3498. Reverse Degree of a String
Day          : 356
Date         : 2026-09-21
*/

class Solution{
    fun reverseDegree(s:String)=s.withIndex().sumOf{(i,c)->(i+1)*(123-c.code)}
}