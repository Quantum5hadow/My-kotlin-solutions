/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-ii/solutions/8346744/kotlin-easy-by-pixelprince-6azk
Problem      : 3559. Number of Ways to Assign Edge Weights II
Day          : 255
Date         : 2026-06-12
*/

class Solution{
    fun assignEdgeWeights(e:Array<IntArray>,q:Array<IntArray>):IntArray{
        val n=e.size+1;val g=Array(n+1){ArrayList<Int>()}
        for((u,v) in e){g[u].add(v);g[v].add(u)}
        var lg=1;while(1 shl lg<=n)lg++
        val up=Array(lg){IntArray(n+1)};val d=IntArray(n+1)
        val st=ArrayDeque<Int>();st+=1
        while(st.isNotEmpty()){
            val u=st.removeLast()
            for(v in g[u])if(v!=up[0][u]){
                up[0][v]=u;d[v]=d[u]+1;st+=v
            }
        }
        for(i in 1 until lg)for(v in 1..n)up[i][v]=up[i-1][up[i-1][v]]
        val p=IntArray(n+1);p[0]=1
        for(i in 1..n)p[i]=((p[i-1].toLong()*2)%1_000_000_007).toInt()
        fun lca(a:Int,b:Int):Int{
            var x=a;var y=b
            if(d[x]<d[y]){x=b;y=a}
            var k=d[x]-d[y]
            for(i in 0 until lg)if(k shr i and 1>0)x=up[i][x]
            if(x==y)return x
            for(i in lg-1 downTo 0)if(up[i][x]!=up[i][y]){x=up[i][x];y=up[i][y]}
            return up[0][x]
        }
        return IntArray(q.size){
            val(u,v)=q[it];val w=lca(u,v)
            val dist=d[u]+d[v]-2*d[w]
            if(dist==0)0 else p[dist-1]
        }
    }
}