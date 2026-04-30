
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-path-score-in-a-grid/solutions/8117803/kotlin-easy-by-pixelprince-fy4r
Problem      : 3742. Maximum Path Score in a Grid
Day          : 212
Date         : 2026-04-30


class Solution{
    fun maxPathScore(g:Array<IntArray>,k:Int):Int{
        val n=g.size;val m=g[0].size
        val dp=HashMap<Int,Int>()
        fun f(x:Int,y:Int,c:Int):Int{
            val key=x*1000000+y*1000+c
            dp[key]?.let{return it}
            val nc=c+(g.getOrNull(y)?.getOrNull(x)?.plus(1)?.div(2)?:2000)
            if(nc>k)return -1e9.toInt()
            val res=if(x==m-1&&y==n-1)g[y][x]
            else g[y][x]+maxOf(f(x+1,y,nc),f(x,y+1,nc))
            dp[key]=res;return res
        }
        val r=f(0,0,0)
        return if(r<0)-1 else r
    }
}