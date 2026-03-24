/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/construct-product-matrix/solutions/7687440/kotlin-easy-by-pixelprince-bfwq
Problem      : 2906. Construct Product Matrix
Day          : 175
Date         : 2026-03-24
*/

class Solution{
    fun constructProductMatrix(g:Array<IntArray>):Array<IntArray>{
        val mod=12345;val n=g.size;val m=g[0].size;val N=n*m
        val a=IntArray(N);var k=0
        for(i in 0 until n)for(j in 0 until m)a[k++]=g[i][j]%mod
        val p=IntArray(N);val s=IntArray(N)
        var cur=1L
        for(i in 0 until N){p[i]=cur.toInt();cur=cur*a[i]%mod}
        cur=1L
        for(i in N-1 downTo 0){s[i]=cur.toInt();cur=cur*a[i]%mod}
        return Array(n){i->IntArray(m){j->((p[i*m+j].toLong()*s[i*m+j])%mod).toInt()}}
    }
}