// ┌────────────────────────────────────────────────────────────┐
// │  LeetCode ID  : PixelPrince                                │
// │  Profile      : https://leetcode.com/u/PixelPrince/        │
// │  Submission   : https://leetcode.com/problems/score-of-parentheses/solutions/8556423/kotlin-easy-by-pixelprince-wjqu│
// │  Problem      : 856. Score of Parentheses                  │
// │  Day          : 370                                        │
// │  Date         : 2026-10-05                                 │
// └────────────────────────────────────────────────────────────┘

class Solution{
    fun scoreOfParentheses(s:String)=run{
        var d=0;var r=0
        for(i in s.indices)when(s[i]){
            '('->d++
            ')'->{if(s[i-1]=='(')r+=1 shl (d-1);d--}
        }
        r
    }
}