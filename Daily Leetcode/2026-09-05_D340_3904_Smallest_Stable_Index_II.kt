/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-stable-index-ii/solutions/8503279/kotlin-easy-by-pixelprince-m423
Problem      : 3904. Smallest Stable Index II
Day          : 340
Date         : 2026-09-05
*/

class Solution {
    fun firstStableIndex(n:IntArray,k:Int):Int {
        val s=n.copyOf()
        for(i in n.lastIndex-1 downTo 0)s[i]=minOf(s[i],s[i+1])
        var mx=n[0]
        for(i in n.indices){
            mx=maxOf(mx,n[i])
            if(mx-s[i]<=k)return i
        }
        return -1
    }
}