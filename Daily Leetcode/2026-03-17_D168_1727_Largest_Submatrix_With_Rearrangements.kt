/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/largest-submatrix-with-rearrangements/solutions/7654509/kotlin-easy-by-pixelprince-kswn
Problem      : 1727. Largest Submatrix With Rearrangements
Day          : 168
Date         : 2026-03-17
*/

class Solution{
    fun largestSubmatrix(m:Array<IntArray>):Int{
        var ans=0
        for(i in m.indices){
            if(i>0)for(j in m[i].indices)if(m[i][j]>0)m[i][j]+=m[i-1][j]
            val r=m[i].sortedDescending()
            for(j in r.indices)ans=maxOf(ans,r[j]*(j+1))
        }
        return ans
    }
}
