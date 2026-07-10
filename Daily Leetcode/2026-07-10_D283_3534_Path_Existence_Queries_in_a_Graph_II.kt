/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/path-existence-queries-in-a-graph-ii/solutions/8387412/kotlin-easy-by-pixelprince-8twc
Problem      : 3534. Path Existence Queries in a Graph II
Day          : 283
Date         : 2026-07-10
*/

class Solution{
    fun pathExistenceQueries(n:Int,a:IntArray,d:Int,q:Array<IntArray>):IntArray{
        val v=Array(n){intArrayOf(a[it],it)};v.sortBy{it[0]}
        val p=IntArray(n);for(i in 0 until n)p[v[i][1]]=i
        val j=Array(18){IntArray(n)};var r=0
        for(i in 0 until n){
            r=maxOf(r,i)
            while(r+1<n&&v[r+1][0]-v[r][0]<=d&&v[r+1][0]-v[i][0]<=d)r++
            j[0][i]=r
        }
        for(k in 1..17)for(i in 0 until n)j[k][i]=j[k-1][j[k-1][i]]
        return IntArray(q.size){
            var(l,h)=q[it].let{intArrayOf(p[it[0]],p[it[1]])}
            if(l>h)l=h.also{h=l}
            if(l==h)return@IntArray 0
            var s=0
            for(k in 17 downTo 0)if(j[k][l]<h){l=j[k][l];s+=1 shl k}
            if(j[0][l]>=h)s+1 else -1
        }
    }
}