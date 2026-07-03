/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/network-recovery-pathways/solutions/8373328/kotlin-easy-by-pixelprince-zk9c
Problem      : 3620. Network Recovery Pathways
Day          : 276
Date         : 2026-07-03
*/

class Solution{
    fun findMaxPathScore(e:Array<IntArray>,o:BooleanArray,k:Long):Int{
        val g=Array(o.size){ArrayList<Pair<Int,Int>>()}
        for((u,v,w) in e)if(o[u]&&o[v])g[u]+=v to w
        var l=0;var r=1_000_000_000
        while(l<=r){
            val m=(l+r)/2
            val d=LongArray(o.size){Long.MAX_VALUE};d[0]=0
            val q=PriorityQueue(compareBy<Pair<Long,Int>>{it.first});q+=0L to 0
            while(q.isNotEmpty()){
                val(s,x)=q.poll()
                if(s!=d[x])continue
                for((y,w) in g[x])if(w>=m&&s+w<=k&&s+w<d[y]){
                    d[y]=s+w
                    q+=d[y] to y
                }
            }
            if(d.last()!=Long.MAX_VALUE)l=m+1 else r=m-1
        }
        return r
    }
}