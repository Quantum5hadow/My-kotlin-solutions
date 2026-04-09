
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/xor-after-range-multiplication-queries-ii/solutions/7837216/kotlin-easy-by-pixelprince-ygfr
Problem      : 3655. XOR After Range Multiplication Queries II
Day          : 191
Date         : 2026-04-09

class Solution{
    private val M=1_000_000_007L
    private fun inv(a:Int):Int{
        var b=a.toLong();var e=M-2;var r=1L
        while(e>0){if(e and 1L==1L)r=r*b%M;b=b*b%M;e=e shr 1}
        return r.toInt()
    }
    fun xorAfterQueries(a:IntArray,q:Array<IntArray>):Int{
        val n=a.size;val B=kotlin.math.sqrt(n.toDouble()).toInt()+1
        val buck=Array(B+1){arrayOfNulls<ArrayList<IntArray>>(0)}
        val big=ArrayList<IntArray>()
        for(x in q){
            val l=x[0];val r=x[1];val k=x[2];val v=x[3]
            if(k<=B){
                if(buck[k].isEmpty())buck[k]=Array(k){arrayListOf()}
                buck[k][l%k]!!.add(intArrayOf(l,r,v))
            }else big.add(x)
        }
        for(k in 1..B){
            val arr=buck[k];if(arr.isEmpty())continue
            for(r in 0 until k){
                val list=arr[r]?:continue
                val len=(n-1-r)/k+1;val d=LongArray(len+1){1}
                for(x in list){
                    val s=(x[0]-r)/k;val e=(x[1]-r)/k
                    d[s]=d[s]*x[2]%M
                    if(e+1<len)d[e+1]=d[e+1]*inv(x[2])%M
                }
                var cur=1L;var i=r
                for(t in 0 until len){
                    cur=cur*d[t]%M
                    a[i]=(a[i].toLong()*cur%M).toInt()
                    i+=k
                }
            }
        }
        for(x in big){
            var i=x[0]
            while(i<=x[1]){
                a[i]=(a[i].toLong()*x[3]%M).toInt()
                i+=x[2]
            }
        }
        var ans=0
        for(v in a)ans=ans xor v
        return ans
    }
}
