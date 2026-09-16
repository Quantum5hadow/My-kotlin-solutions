/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/solutions/8523674/kotlin-easy-by-pixelprince-qheu
Problem      : 1621. Number of Sets of K Non-Overlapping Line Segments
Day          : 351
Date         : 2026-09-16
*/

class Solution{
    fun numberOfSets(n:Int,k:Int):Int{
        val m=1_000_000_007L
        var r=1L
        for(i in 1..2*k){
            r=r*(n+k-i)%m
            r=r*pow(i.toLong(),m-2,m)%m
        }
        return r.toInt()
    }
    fun pow(a0:Long,e0:Long,m:Long):Long{
        var a=a0;var e=e0;var r=1L
        while(e>0){if(e%2==1L)r=r*a%m;a=a*a%m;e/=2}
        return r
    }
}