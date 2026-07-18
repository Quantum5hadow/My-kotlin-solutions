/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-greatest-common-divisor-of-array/solutions/8404966/kotlin-easy-by-pixelprince-q5ck
Problem      : 1979. Find Greatest Common Divisor of Array
Day          : 291
Date         : 2026-07-18
*/
class Solution{
    fun findGCD(a:IntArray):Int{
        var x=a.min()
        var y=a.max()
        while(y>0) y.also{y=x%it;x=it}
        return x
    }
}
