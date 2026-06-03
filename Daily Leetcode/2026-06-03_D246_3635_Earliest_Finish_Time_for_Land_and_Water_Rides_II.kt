/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/solutions/8310982/kotlin-easy-by-pixelprince-xv4h
Problem      : 3635. Earliest Finish Time for Land and Water Rides II
Day          : 246
Date         : 2026-06-03
*/

class Solution{
    fun earliestFinishTime(a:IntArray,b:IntArray,c:IntArray,d:IntArray)=run{
        fun f(s:IntArray,t:IntArray)={x:Int->s.indices.minOf{maxOf(x,s[it])+t[it]}}
        val p=f(a,b);val q=f(c,d)
        minOf(p(q(0)),q(p(0)))
    }
}