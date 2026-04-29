
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-score-from-grid-operations/solutions/8111470/kotlin-easy-by-pixelprince-sylv
Problem      : 3225. Maximum Score From Grid Operations
Day          : 211
Date         : 2026-04-29


class Solution{
    fun maximumScore(g:Array<IntArray>):Long{
        val n=g.size;if(n==1)return 0
        var d0=LongArray(n+1);var d1=LongArray(n+1)
        for(j in 1 until n){
            val nd0=LongArray(n+1);val nd1=LongArray(n+1)
            for(i in 0..n){
                var p=0L;var c=0L
                for(x in 0 until i)c+=g[x][j]
                for(y in 0..n){
                    if(y>0&&y<=i)c-=g[y-1][j]
                    if(y>i)p+=g[y-1][j-1]
                    nd0[y]=maxOf(nd0[y],maxOf(p+d0[i],d1[i]))
                    nd1[y]=maxOf(nd1[y],maxOf(c+d1[i],c+p+d0[i]))
                }
            }
            d0=nd0;d1=nd1
        }
        return d1.maxOrNull()?:0
    }
}
