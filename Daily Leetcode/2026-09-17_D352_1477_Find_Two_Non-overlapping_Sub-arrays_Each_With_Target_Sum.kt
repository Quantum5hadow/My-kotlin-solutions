/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/solutions/8526600/kotlin-easy-by-pixelprince-6110
Problem      : 1477. Find Two Non-overlapping Sub-arrays Each With Target Sum
Day          : 352
Date         : 2026-09-17
*/

class Solution{
    fun minSumOfLengths(a:IntArray,t:Int)=run{
        val n=a.size;val d=IntArray(n){n+1};var s=0;var l=0
        for(r in 0 until n){
            s+=a[r];while(s>t)s-=a[l++]
            d[r]=minOf(if(r>0)d[r-1] else n+1,if(s==t)r-l+1 else n+1)
        }
        s=0;l=n-1;var m=n+1;var ans=n+1
        for(r in n-1 downTo 1){
            s+=a[r];while(s>t)s-=a[l--]
            if(s==t)m=minOf(m,l-r+1)
            ans=minOf(ans,m+d[r-1])
        }
        if(ans>n) -1 else ans
    }
}