/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-cost-path-with-edge-reversals/solutions/7583400/minimum-cost-path-with-edge-reversals-ea-qtvq
Problem      : 3650. Minimum Cost Path with Edge Reversals
Day          : 119
Date         : 2026-01-27
*/

class Solution {
    private var idx = 0
    private lateinit var head:IntArray
    private lateinit var next:IntArray
    private lateinit var to:IntArray
    private lateinit var w:IntArray

    private fun init(n:Int,m:Int){
        head=IntArray(n){-1}
        next=IntArray(m)
        to=IntArray(m)
        w=IntArray(m)
    }

    private fun add(u:Int,v:Int,c:Int){
        to[idx]=v
        w[idx]=c
        next[idx]=head[u]
        head[u]=idx++
    }

    private fun dijkstra(s:Int,t:Int,n:Int):Int{
        val pq=java.util.PriorityQueue<Pair<Int,Int>>(compareBy{it.second})
        val d=IntArray(n){INF}
        d[s]=0
        pq.add(s to 0)
        while(pq.isNotEmpty()){
            val (u,du)=pq.poll()
            if(du>d[u])continue
            if(u==t)return du
            var e=head[u]
            while(e!=-1){
                val v=to[e]
                val nd=du+w[e]
                if(nd<d[v]){
                    d[v]=nd
                    pq.add(v to nd)
                }
                e=next[e]
            }
        }
        return INF
    }

    fun minCost(n:Int,edges:Array<IntArray>):Int{
        init(n,edges.size*2)
        for(e in edges){
            add(e[0],e[1],e[2])
            add(e[1],e[0],e[2]*2)
        }
        val ans=dijkstra(0,n-1,n)
        return if(ans>=INF)-1 else ans
    }

    companion object{
        const val INF=1_000_000_000
    }
}

