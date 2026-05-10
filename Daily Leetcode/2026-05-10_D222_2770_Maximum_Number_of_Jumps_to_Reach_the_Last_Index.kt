/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/solutions/8255957/kotlin-easy-by-pixelprince-21i1
Problem      : 2770. Maximum Number of Jumps to Reach the Last Index
Day          : 222
Date         : 2026-05-10
*/

class Solution{
    fun maximumJumps(a:IntArray,t:Int):Int{
        val n=a.size;val d=IntArray(n){-1};d[0]=0
        for(i in 0 until n)if(d[i]>=0)
            for(j in i+1 until n)
                if(kotlin.math.abs(a[i]-a[j])<=t)
                    d[j]=maxOf(d[j],d[i]+1)
        return d[n-1]
    }
}