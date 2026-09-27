/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/solutions/8543371/kotlin-easy-by-pixelprince-itkd
Problem      : 1190. Reverse Substrings Between Each Pair of Parentheses
Day          : 362
Date         : 2026-09-27
*/

class Solution{
    fun reverseParentheses(s:String):String{
        val st=java.util.Stack<String>()
        var cur=""
        for(c in s)when(c){
            '('->{st.push(cur);cur=""}
            ')'->{cur=st.pop()+cur.reversed()}
            else->cur+=c
        }
        return cur
    }
}