/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimize-hamming-distance-after-swap-operations/solutions/8031385/kotlin-easy-by-pixelprince-9274
Problem      : 1722. Minimize Hamming Distance After Swap Operations
Day          : 203
Date         : 2026-04-21
*/

class Solution{
    fun minimumHammingDistance(s:IntArray,t:IntArray,a:Array<IntArray>):Int{
        val p=IntArray(s.size){it}
        fun f(x:Int):Int{if(p[x]!=x)p[x]=f(p[x]);return p[x]}
        for(e in a)p[f(e[0])]=f(e[1])
        val m=Array(s.size){HashMap<Int,Int>()}
        for(i in s.indices)m[f(i)][s[i]]=(m[f(i)][s[i]]?:0)+1
        var ans=0
        for(i in s.indices){
            val r=f(i);val c=m[r][t[i]]?:0
            if(c>0)m[r][t[i]]=c-1 else ans++
        }
        return ans
    }
}