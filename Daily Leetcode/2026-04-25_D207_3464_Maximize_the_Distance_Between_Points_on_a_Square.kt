
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximize-the-distance-between-points-on-a-square/solutions/8096970/kotlin-easy-by-pixelprince-m28c
Problem      : 3464. Maximize the Distance Between Points on a Square
Day          : 207
Date         : 2026-04-25


class Solution{
    fun maxDistance(s:Int,p:Array<IntArray>,k:Int):Int{
        val n=p.size;val a=LongArray(n)
        for(i in 0 until n){
            val x=p[i][0];val y=p[i][1]
            a[i]=when{
                y==0->x.toLong()
                x==s->s+y.toLong()
                y==s->2L*s+(s-x)
                else->3L*s+(s-y)
            }
        }
        a.sort()
        val c=4L*s;val d=LongArray(2*n)
        for(i in 0 until n){d[i]=a[i];d[i+n]=a[i]+c}
        var l=0;var r=2*s;var ans=0
        fun ok(x:Int):Boolean{
            val nx=IntArray(2*n);var j=0
            for(i in 0 until 2*n){
                if(j<i+1)j=i+1
                while(j<2*n&&d[j]<d[i]+x)j++
                nx[i]=if(j<2*n)j else -1
            }
            for(i in 0 until n){
                var cur=i;var cnt=1
                while(cnt<k){
                    val ni=nx[cur]
                    if(ni==-1||ni>=i+n)break
                    cur=ni;cnt++
                }
                if(cnt==k&&d[i]+c-d[cur]>=x)return true
            }
            return false
        }
        while(l<=r){
            val m=(l+r) ushr 1
            if(ok(m)){ans=m;l=m+1}else r=m-1
        }
        return ans
    }
}