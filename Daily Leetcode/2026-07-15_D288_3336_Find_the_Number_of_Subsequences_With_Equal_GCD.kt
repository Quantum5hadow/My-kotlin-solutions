/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/solutions/8397565/kotlin-easy-by-pixelprince-jqyr
Problem      : 3336. Find the Number of Subsequences With Equal GCD
Day          : 288
Date         : 2026-07-15
*/

class Solution{
    fun subsequencePairCount(a:IntArray):Int{
        val M=1_000_000_007L
        val dp=HashMap<Pair<Int,Int>,Long>().apply{this[0 to 0]=1}
        fun gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)
        fun g(x:Int,y:Int)=if(x==0)y else if(y==0)x else gcd(x,y)
        for(v in a){
            val nd=HashMap<Pair<Int,Int>,Long>()
            for((k,c) in dp){
                val(x,y)=k
                nd[x to y]=((nd[x to y]?:0)+c)%M
                nd[g(x,v) to y]=((nd[g(x,v) to y]?:0)+c)%M
                nd[x to g(y,v)]=((nd[x to g(y,v)]?:0)+c)%M
            }
            dp.clear()
            dp.putAll(nd)
        }
        var ans=0L
        for((k,v) in dp)if(k.first>0&&k.first==k.second)ans=(ans+v)%M
        return ans.toInt()
    }
}