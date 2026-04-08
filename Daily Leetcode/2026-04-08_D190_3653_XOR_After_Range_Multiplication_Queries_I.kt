
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/xor-after-range-multiplication-queries-i/solutions/7837240/kotlin-easy-by-pixelprince-ofjh
Problem      : 3653. XOR After Range Multiplication Queries I
Day          : 190
Date         : 2026-04-08

class Solution{
    fun xorAfterQueries(a:IntArray,q:Array<IntArray>):Int{
        val MOD=1_000_000_007
        for(t in q){
            val l=t[0];val r=t[1];val k=t[2];val v=t[3]
            var i=l
            while(i<=r&&i<a.size){
                a[i]=((a[i].toLong()*v)%MOD).toInt()
                i+=k
            }
        }
        var x=0
        for(v in a)x=x xor v
        return x
    }
}