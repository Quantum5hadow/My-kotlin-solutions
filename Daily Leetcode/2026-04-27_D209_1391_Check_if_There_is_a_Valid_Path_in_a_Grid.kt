/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/solutions/8102553/kotlin-easy-by-pixelprince-cw3p
Problem      : 1391. Check if There is a Valid Path in a Grid
Day          : 209
Date         : 2026-04-27
*/

class Solution {
    fun hasValidPath(g: Array<IntArray>): Boolean {
        val n = g.size; val m = g[0].size
        val p = IntArray(n*m){it}
        fun f(x:Int):Int{ if(p[x]!=x)p[x]=f(p[x]); return p[x] }
        fun u(a:Int,b:Int){ p[f(a)] = f(b) }

        val dir = arrayOf(
            intArrayOf(),
            intArrayOf(0,-1,0,1),
            intArrayOf(-1,0,1,0),
            intArrayOf(0,-1,1,0),
            intArrayOf(0,1,1,0),
            intArrayOf(0,-1,-1,0),
            intArrayOf(0,1,-1,0)
        )

        for(i in 0 until n) for(j in 0 until m){
            val id = i*m + j
            val d = dir[g[i][j]]
            for(k in 0..1){
                val ni=i+d[k*2]; val nj=j+d[k*2+1]
                if(ni in 0 until n && nj in 0 until m){
                    val back = dir[g[ni][nj]]
                    for(t in 0..1)
                        if(ni+back[t*2]==i && nj+back[t*2+1]==j)
                            u(id, ni*m+nj)
                }
            }
        }
        return f(0)==f(n*m-1)
    }
}