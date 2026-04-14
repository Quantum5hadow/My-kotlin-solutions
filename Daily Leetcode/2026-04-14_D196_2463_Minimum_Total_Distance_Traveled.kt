/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-total-distance-traveled/solutions/7921405/kotlin-easy-by-pixelprince-v0ux
Problem      : 2463. Minimum Total Distance Traveled
Day          : 196
Date         : 2026-04-14
*/

class Solution{
    fun minimumTotalDistance(r:List<Int>,f:Array<IntArray>):Long{
        val a=r.sorted()
        val b=mutableListOf<Int>()
        f.sortBy{it[0]}
        for(x in f)repeat(x[1]){b+=x[0]}
        val n=a.size;val m=b.size
        val dp=Array(n+1){LongArray(m+1){Long.MAX_VALUE/2}}
        dp[0][0]=0
        for(i in 0..n)for(j in 1..m){
            dp[i][j]=dp[i][j-1]
            if(i>0)dp[i][j]=minOf(dp[i][j],dp[i-1][j-1]+kotlin.math.abs(a[i-1]-b[j-1]))
        }
        return dp[n][m]
    }
}