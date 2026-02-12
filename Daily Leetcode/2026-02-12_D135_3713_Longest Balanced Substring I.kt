/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-balanced-substring-i/solutions/7583493/longest-balanced-substring-i-easy-by-pix-oj4p
Problem      : 3713. Longest Balanced Substring I
Day          : 135
Date         : 2026-02-12
*/

class Solution{
    fun longestBalanced(s:String):Int{
        var r=0
        for(i in s.indices){
            val f=IntArray(26);var k=0;var m=0
            for(j in i until s.length){
                val x=s[j]-'a'
                if(++f[x]==1)k++
                if(f[x]>m)m=f[x]
                if(m*k==j-i+1)r=maxOf(r,j-i+1)
            }
        }
        return r
    }
}