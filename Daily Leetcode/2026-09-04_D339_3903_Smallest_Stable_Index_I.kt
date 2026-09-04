/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-stable-index-i/solutions/8501242/kotlin-easy-by-pixelprince-ruyw
Problem      : 3903. Smallest Stable Index I
Day          : 339
Date         : 2026-09-04
*/

class Solution{
    fun firstStableIndex(a:IntArray,k:Int):Int{
        val s=a.copyOf()
        for(i in a.lastIndex-1 downTo 0)s[i]=minOf(s[i],s[i+1])
        var mx=Int.MIN_VALUE
        return a.indices.firstOrNull{
            mx=maxOf(mx,a[it])
            mx-s[it]<=k
        }?:-1
    }
}