/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/shift-2d-grid/solutions/8409213/kotlin-easy-by-pixelprince-wb7e
Problem      : 1260. Shift 2D Grid
Day          : 293
Date         : 2026-07-20
*/

class Solution{
    fun shiftGrid(g:Array<IntArray>,k:Int):List<List<Int>>{
        val n=g.size
        val m=g[0].size
        val t=n*m
        return List(n){i->List(m){j->
            val x=(i*m+j-k%t+t)%t
            g[x/m][x%m]
        }}
    }
}