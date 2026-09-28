/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/solutions/8544173/kotlin-easy-by-pixelprince-wcy8
Problem      : 1614. Maximum Nesting Depth of the Parentheses
Day          : 363
Date         : 2026-09-28
*/

class Solution{
    fun maxDepth(s:String)=s.fold(0 to 0){(d,m),c->
        (d+(c=='(').compareTo(c==')')).let{it to maxOf(m,it)}
    }.second
}
