/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/special-binary-string/solutions/7594149/easy-by-pixelprince-9hrr
Problem      : 761. Special Binary String
Day          : 143
Date         : 2026-02-20
*/

class Solution{
    fun makeLargestSpecial(s:String):String{
        var c=0;var i=0
        val r=ArrayList<String>()
        for(j in s.indices){
            if(s[j]=='1')c++ else c--
            if(c==0){r+="1"+makeLargestSpecial(s.substring(i+1,j))+"0";i=j+1}
        }
        return r.sortedDescending().joinToString("")
    }
}