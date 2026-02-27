/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-operations-to-equalize-binary-string/solutions/7612553/kotlin-easy-by-pixelprince-f9sm
Problem      : 3666. Minimum Operations to Equalize Binary String
Day          : 145
Date         : 2026-02-27
*/

class Solution{
    fun minOperations(s:String,k:Int):Int{
        val n=s.length;val z=s.count{it=='0'}
        if(z==0)return 0
        if(k==n)return if(z==n)1 else -1
        var best=Long.MAX_VALUE
        for(p in 0..1) if(((p*(k and 1)) and 1)==(z and 1)){
            val mis=if(p==0)z else n-z
            var t=maxOf((z+k-1L)/k,(mis+(n-k)-1L)/(n-k))
            if(t<1)t=1
            if((t and 1L)!=p.toLong())t++
            if(t<best)best=t
        }
        return if(best==Long.MAX_VALUE)-1 else best.toInt()
    }
}