
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-amount-of-money-robot-can-earn/solutions/7747400/kotlin-easy-by-pixelprince-bzji
Problem      : 3418. Maximum Amount of Money Robot Can Earn
Day          : 184
Date         : 2026-04-02

class Solution{
    fun maximumAmount(a:Array<IntArray>):Int{
        val n=a.size;val m=a[0].size
        val dp=Array(n){Array(m){IntArray(3){-1_000_000_000}}}
        fun go(i:Int,j:Int,k:Int):Int{
            if(i>=n||j>=m)return -1_000_000_000
            val v=a[i][j]
            if(i==n-1&&j==m-1)
                return if(v<0&&k>0)0 else v
            if(dp[i][j][k]!=-1_000_000_000)return dp[i][j][k]
            var best=v+maxOf(go(i+1,j,k),go(i,j+1,k))
            if(v<0&&k>0)
                best=maxOf(best,maxOf(go(i+1,j,k-1),go(i,j+1,k-1)))
            dp[i][j][k]=best
            return best
        }
        return go(0,0,2)
    }
}