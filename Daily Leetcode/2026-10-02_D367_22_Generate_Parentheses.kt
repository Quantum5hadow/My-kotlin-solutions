/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/generate-parentheses/solutions/8551144/kotlin-easy-by-pixelprince-3uu8
Problem      : 22. Generate Parentheses
Day          : 367
Date         : 2026-10-02
*/

class Solution{
    fun generateParenthesis(n:Int):List<String>{
        val r=mutableListOf<String>()
        fun f(s:String,o:Int,c:Int){
            if(s.length==n*2){r+=s;return}
            if(o<n)f("$s(",o+1,c)
            if(c<o)f("$s)",o,c+1)
        }
        f("",0,0);return r
    }
}