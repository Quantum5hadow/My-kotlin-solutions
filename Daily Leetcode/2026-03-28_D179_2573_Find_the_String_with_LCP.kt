/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-string-with-lcp/solutions/7706683/easy-kotlin-by-pixelprince-my46
Problem      : 2573. Find the String with LCP
Day          : 179
Date         : 2026-03-28
*/

class Solution{
    fun findTheString(l:Array<IntArray>):String{
        val n=l.size
        val s=CharArray(n)
        var c='a'
        for(i in 0 until n)if(s[i]==0.toChar()){
            if(c>'z')return ""
            for(j in i until n)if(l[i][j]>0)s[j]=c
            c++
        }
        val dp=Array(n+1){IntArray(n+1)}
        for(i in n-1 downTo 0)for(j in n-1 downTo 0)
            if(s[i]==s[j])dp[i][j]=dp[i+1][j+1]+1
        for(i in 0 until n)for(j in 0 until n)
            if(dp[i][j]!=l[i][j])return ""
        return String(s)
    }
}