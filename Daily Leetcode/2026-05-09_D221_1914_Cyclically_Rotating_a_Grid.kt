/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/cyclically-rotating-a-grid/solutions/8255950/kotlin-easy-by-pixelprince-h1bl
Problem      : 1914. Cyclically Rotating a Grid
Day          : 221
Date         : 2026-05-09
*/

class Solution{
    fun rotateGrid(g:Array<IntArray>,k:Int):Array<IntArray>{
        val h=g.size;val w=g[0].size
        for(l in 0 until minOf(h,w)/2){
            val q=ArrayList<Pair<Int,Int>>()
            for(i in l until w-l)q+=l to i
            for(i in l+1 until h-l)q+=i to w-1-l
            for(i in w-2-l downTo l)q+=h-1-l to i
            for(i in h-2-l downTo l+1)q+=i to l
            val v=q.map{g[it.first][it.second]}
            for(i in q.indices){
                val (r,c)=q[i]
                g[r][c]=v[(i+k)%v.size]
            }
        }
        return g
    }
}