
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-walls-destroyed-by-robots/solutions/7766135/kotlin-easy-by-pixelprince-jxfq
Problem      : 3661. Maximum Walls Destroyed by Robots
Day          : 185
Date         : 2026-04-03

class Solution{
    fun maxWalls(r:IntArray,d:IntArray,w:IntArray):Int{
        val idx=r.indices.sortedBy{r[it]}
        w.sort();val dp=HashMap<Int,Int>()
        fun bs(v:Int)=w.binarySearch(v).let{if(it<0)-it-1 else it}
        fun cnt(l:Int,r:Int)=if(l>r)0 else bs(r+1)-bs(l)
        fun f(i:Int,c:Int):Int{
            if(i==r.size)return 0
            val key=i*3+c
            dp[key]?.let{return it}
            val p=r[idx[i]];val rad=d[idx[i]]
            val prev=if(i==0)0 else if(c>0)minOf(r[idx[i-1]]+d[idx[i-1]],p-1) else r[idx[i-1]]
            val L=maxOf(p-rad,prev+1)
            val R=minOf(p+rad,if(i+1<r.size)r[idx[i+1]]-1 else Int.MAX_VALUE)
            val res=maxOf(cnt(L,p)+f(i+1,0),cnt(p,R)+f(i+1,1))
            dp[key]=res;return res
        }
        return f(0,0)
    }
}