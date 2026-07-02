/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-a-safe-walk-through-a-grid/solutions/8371198/kotlin-easy-by-pixelprince-etfp
Problem      : 3286. Find a Safe Walk Through a Grid
Day          : 275
Date         : 2026-07-02
*/

class Solution{
    data class T(val x:Int,val y:Int,val c:Int)
    fun findSafeWalk(g:List<List<Int>>,h:Int):Boolean{
        val n=g.size;val m=g[0].size
        val d=Array(n){IntArray(m){1 shl 30}}
        val q=PriorityQueue<T>{a,b->a.c-b.c}
        q+=T(0,0,g[0][0]);d[0][0]=g[0][0]
        val dx=intArrayOf(1,-1,0,0)
        val dy=intArrayOf(0,0,1,-1)
        while(q.isNotEmpty()){
            val(x,y,c)=q.poll()
            if(c!=d[x][y])continue
            for(i in 0..3){
                val X=x+dx[i]
                val Y=y+dy[i]
                if(X !in 0 until n||Y !in 0 until m)continue
                val v=c+g[X][Y]
                if(v<d[X][Y]&&v<h){
                    d[X][Y]=v
                    q+=T(X,Y,v)
                }
            }
        }
        return d[n-1][m-1]<h
    }
}