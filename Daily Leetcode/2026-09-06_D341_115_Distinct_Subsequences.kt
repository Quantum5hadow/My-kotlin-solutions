/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/distinct-subsequences/solutions/8505344/kotlin-easy-by-pixelprince-iupt
Problem      : 115. Distinct Subsequences
Day          : 341
Date         : 2026-09-06
*/

class Solution {
    fun numDistinct(s:String,t:String):Int {
        val d=IntArray(t.length+1)
        d[0]=1
        for(c in s)
            for(j in t.lastIndex downTo 0)
                if(c==t[j])d[j+1]+=d[j]
        return d[t.length]
    }
}