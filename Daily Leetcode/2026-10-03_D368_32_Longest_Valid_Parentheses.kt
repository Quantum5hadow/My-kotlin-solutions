// ┌────────────────────────────────────────────────────────────┐
// │  LeetCode ID  : PixelPrince                                │
// │  Profile      : https://leetcode.com/u/PixelPrince/        │
// │  Submission   : https://leetcode.com/problems/longest-valid-parentheses/solutions/8552752/kotlin-easy-by-pixelprince-2ijl│
// │  Problem      : 32. Longest Valid Parentheses              │
// │  Day          : 368                                        │
// │  Date         : 2026-10-03                                 │
// └────────────────────────────────────────────────────────────┘

class Solution{
    fun longestValidParentheses(s:String):Int{
        val st=java.util.ArrayDeque<Int>();st.add(-1)
        var ans=0
        for(i in s.indices)
            if(s[i]=='(')st.add(i)
            else{st.removeLast();if(st.isEmpty())st.add(i)else ans=maxOf(ans,i-st.peekLast())}
        return ans
    }
}