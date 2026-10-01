/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/valid-parentheses/solutions/8550574/kotlin-easy-by-pixelprince-pca9
Problem      : 20. Valid Parentheses
Day          : 366
Date         : 2026-10-01
*/

class Solution{
    fun isValid(s:String):Boolean{
        val st=ArrayDeque<Char>()
        for(c in s)when(c){
            '(', '[', '{'->st.addLast(c)
            else->if(st.isEmpty()||c-st.removeLast() !in 1..2)return false
        }
        return st.isEmpty()
    }
}