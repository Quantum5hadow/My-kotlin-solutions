/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/solutions/8407329/kotlin-easy-by-pixelprince-kcj2
Problem      : 1081. Smallest Subsequence of Distinct Characters
Day          : 292
Date         : 2026-07-19
*/

class Solution{
    fun smallestSubsequence(s:String):String{
        val p=IntArray(26)
        s.indices.forEach{p[s[it]-'a']=it}
        val st=CharArray(26)
        val v=BooleanArray(26)
        var t=0
        for(i in s.indices){
            val c=s[i];val x=c-'a'
            if(v[x])continue
            while(t>0&&st[t-1]>c&&p[st[t-1]-'a']>i)v[st[--t]-'a']=false
            st[t++]=c
            v[x]=true
        }
        return String(st,0,t)
    }
}