/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/solutions/8308829/kotlin-easy-by-pixelprince-igys
Problem      : 3633. Earliest Finish Time for Land and Water Rides I
Day          : 245
Date         : 2026-06-02
*/

class Solution{
    fun earliestFinishTime(a:IntArray,b:IntArray,c:IntArray,d:IntArray):Int{
        fun f(s:IntArray,t:IntArray,m:Int)=s.indices.minOf{maxOf(m,s[it])+t[it]}
        return minOf(f(c,d,f(a,b,0)),f(a,b,f(c,d,0)))
    }
}