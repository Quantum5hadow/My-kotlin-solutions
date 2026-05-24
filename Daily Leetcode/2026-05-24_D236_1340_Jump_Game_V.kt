/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/jump-game-v/solutions/8289408/kotlin-easy-by-pixelprince-jix6
Problem      : 1340. Jump Game V
Day          : 236
Date         : 2026-05-24
*/

class Solution{
    fun maxJumps(a:IntArray,d:Int):Int{
        val dp=IntArray(a.size)
        fun f(i:Int):Int{
            if(dp[i]>0)return dp[i]
            var r=1
            for(j in i+1..minOf(i+d,a.lastIndex)){if(a[j]>=a[i])break;r=maxOf(r,f(j)+1)}
            for(j in i-1 downTo maxOf(0,i-d)){if(a[j]>=a[i])break;r=maxOf(r,f(j)+1)}
            return r.also{dp[i]=it}
        }
        return a.indices.maxOf(::f)
    }
}