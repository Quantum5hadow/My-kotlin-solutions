/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/solutions/8400800/kotlin-easy-by-pixelprince-dq5r
Problem      : 3867. Sum of GCD of Formed Pairs
Day          : 289
Date         : 2026-07-16
*/

class Solution{
    fun gcdSum(a:IntArray):Long{
        var m=0
        fun g(x:Int,y:Int):Int=if(y<1)x else g(y,x%y)
        return a.map{m=maxOf(m,it);g(m,it)}.sorted().let{
            it.indices.take(it.size/2).sumOf{i->g(it[i],it[it.lastIndex-i]).toLong()}
        }
    }
}