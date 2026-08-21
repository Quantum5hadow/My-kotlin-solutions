/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/solutions/8473758/kotlin-easy-by-pixelprince-v4tw
Problem      : 3116. Kth Smallest Amount With Single Denomination Combination
Day          : 325
Date         : 2026-08-21
*/

class Solution{
    fun findKthSmallest(c:IntArray,k:Int):Long{
        fun g(a:Long,b:Long):Long=if(b<1)a else g(b,a%b)
        val v=mutableListOf<Pair<Long,Int>>()
        fun f(i:Int,l:Long,s:Int){
            if(i==c.size){if(s>0)v+=l to s;return}
            f(i+1,l,s);f(i+1,l/g(l,c[i].toLong())*c[i],s+1)
        }
        f(0,1,0)
        var a=1L
        var b=1_000_000_000_000_000_000L
        while(a<b){
            val m=(a+b)/2
            var z=0L
            for((x,s) in v) z+=if(s%2>0)m/x else -m/x
            if(z>=k)b=m else a=m+1
        }
        return a
    }
}