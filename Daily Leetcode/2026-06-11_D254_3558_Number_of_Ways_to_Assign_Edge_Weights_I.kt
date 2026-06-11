/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/solutions/8346742/kotlin-easy-by-pixelprince-wjh7
Problem      : 3558. Number of Ways to Assign Edge Weights I
Day          : 254
Date         : 2026-06-11
*/

class Solution{
    fun assignEdgeWeights(e:Array<IntArray>):Int{
        val g=HashMap<Int,MutableList<Int>>()
        for((u,v) in e){
            g.getOrPut(u){ArrayList()}.add(v)
            g.getOrPut(v){ArrayList()}.add(u)
        }
        fun dfs(u:Int,p:Int):Int{
            var d=0
            for(v in g[u]?:emptyList()) if(v!=p) d=maxOf(d,dfs(v,u))
            return d+1
        }
        var p=dfs(1,-1)-2
        var r=1L
        while(p-->0) r=r*2%1_000_000_007
        return r.toInt()
    }
}