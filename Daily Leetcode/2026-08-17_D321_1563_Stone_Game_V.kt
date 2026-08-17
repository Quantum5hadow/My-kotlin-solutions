/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game-v/solutions/8466445/kotlin-easy-by-pixelprince-mihc
Problem      : 1563. Stone Game V
Day          : 321
Date         : 2026-08-17
*/

class Solution {
    fun stoneGameV(a:IntArray):Int{
        val n=a.size;val p=IntArray(n+1)
        for(i in a.indices)p[i+1]=p[i]+a[i]
        val d=Array(n){IntArray(n)}
        for(z in 1 until n)for(l in 0 until n-z){
            val r=l+z
            for(k in l until r){
                val x=p[k+1]-p[l];val y=p[r+1]-p[k+1]
                d[l][r]=maxOf(d[l][r],if(x<=y)x+d[l][k]else 0,if(x>=y)y+d[k+1][r]else 0)
            }
        }
        return d[0][n-1]
    }
}