/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/solutions/8550577/kotlin-easy-by-pixelprince-rd9w
Problem      : 1111. Maximum Nesting Depth of Two Valid Parentheses Strings
Day          : 365
Date         : 2026-09-30
*/

class Solution{
    fun maxDepthAfterSplit(s:String)=run{
        var d=0
        s.map{if(it=='(')d++ and 1 else --d and 1}.toIntArray()
    }
}