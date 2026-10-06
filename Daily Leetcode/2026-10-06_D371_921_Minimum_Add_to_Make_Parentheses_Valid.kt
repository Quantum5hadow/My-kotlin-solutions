// ┌────────────────────────────────────────────────────────────┐
// │  LeetCode ID  : PixelPrince                                │
// │  Profile      : https://leetcode.com/u/PixelPrince/        │
// │  Submission   : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/solutions/8559691/kotlin-easy-by-pixelprince-j7el│
// │  Problem      : 921. Minimum Add to Make Parentheses Valid │
// │  Day          : 371                                        │
// │  Date         : 2026-10-06                                 │
// └────────────────────────────────────────────────────────────┘

class Solution{
    fun minAddToMakeValid(s:String)=run{
        var d=0;var r=0
        for(c in s)if(c=='(')d++ else if(d>0)d-- else r++
        r+d
    }
}