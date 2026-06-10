/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-total-subarray-value-ii/solutions/8346740/kotlin-easy-by-pixelprince-b5ev
Problem      : 3691. Maximum Total Subarray Value II
Day          : 253
Date         : 2026-06-10
*/

class Solution{
    fun maxTotalValue(a:IntArray,k:Int):Long{
        val n=a.size;val mn=IntArray(n*2);val mx=IntArray(n*2)
        for(i in a.indices)mn[i+n]=a[i].also{mx[i+n]=it}
        for(i in n-1 downTo 1){
            mn[i]=minOf(mn[i*2],mn[i*2+1])
            mx[i]=maxOf(mx[i*2],mx[i*2+1])
        }
        fun q(l:Int,r:Int):Int{
            var l=l+n;var r=r+n;var m=Int.MAX_VALUE;var M=Int.MIN_VALUE
            while(l<=r){
                if(l and 1>0){m=minOf(m,mn[l]);M=maxOf(M,mx[l++])}
                if(r and 1==0){m=minOf(m,mn[r]);M=maxOf(M,mx[r--])}
                l/=2;r/=2
            }
            return M-m
        }
        val pq=PriorityQueue<IntArray>{a,b->b[2]-a[2]}
        for(i in a.indices)pq+=intArrayOf(i,n-1,q(i,n-1))
        var ans=0L
        repeat(k){
            val x=pq.poll()
            ans+=x[2]
            if(x[0]<x[1])pq+=intArrayOf(x[0],x[1]-1,q(x[0],x[1]-1))
        }
        return ans
    }
}