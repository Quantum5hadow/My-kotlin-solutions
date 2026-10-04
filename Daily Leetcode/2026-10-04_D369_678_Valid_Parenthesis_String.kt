// ┌────────────────────────────────────────────────────────────┐
// │  LeetCode ID  : PixelPrince                                │
// │  Profile      : https://leetcode.com/u/PixelPrince/        │
// │  Submission   : https://leetcode.com/problems/valid-parenthesis-string/solutions/8554698/kotlin-easy-by-pixelprince-n7eb│
// │  Problem      : 678. Valid Parenthesis String              │
// │  Day          : 369                                        │
// │  Date         : 2026-10-04                                 │
// └────────────────────────────────────────────────────────────┘

class Solution{
    fun checkValidString(s:String):Boolean{
        var x=0
        for(c in s){
            if(c=='('||c=='*')x++ else if(--x<0)return false
        }
        x=0
        for(c in s.reversed()){
            if(c==')'||c=='*')x++ else if(--x<0)return false
        }
        return true
    }
}