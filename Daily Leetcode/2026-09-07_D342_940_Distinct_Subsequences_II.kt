/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/distinct-subsequences-ii/solutions/8507161/kotlin-easy-by-pixelprince-t45f
Problem      : 940. Distinct Subsequences II
Day          : 342
Date         : 2026-09-07
*/

class Solution{
    fun distinctSubseqII(s:String):Int{
        val a=LongArray(26);var x=1L
        for(c in s){
            val i=c-'a';val y=x
            x=(2*x-a[i]+1_000_000_007)%1_000_000_007
            a[i]=y
        }
        return (x-1+1_000_000_007).rem(1_000_000_007).toInt()
    }
}