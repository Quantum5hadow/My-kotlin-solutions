
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rotate-string/solutions/8134390/kotlin-easy-by-pixelprince-xaxh
Problem      : 796. Rotate String
Day          : 215
Date         : 2026-05-03

class Solution{
    fun rotateString(s:String,g:String)=
        s.length==g.length&&(s+s).contains(g)
}
