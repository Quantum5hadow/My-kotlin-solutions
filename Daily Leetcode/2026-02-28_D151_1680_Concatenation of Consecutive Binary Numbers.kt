
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/solutions/7617733/kotlin-easy-by-pixelprince-e6aq
Problem      : 1680. Concatenation of Consecutive Binary Numbers
Day          : 151
Date         : 2026-02-28
*/

class Solution{
    fun concatenatedBinary(n:Int):Int{
        var ans=0L;var len=0
        val mod=1_000_000_007L
        for(i in 1L..n){
            if((i and (i-1))==0L)len++
            ans=((ans shl len)+i)%mod
        }
        return ans.toInt()
    }
}