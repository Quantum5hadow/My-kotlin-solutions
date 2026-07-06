/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/remove-covered-intervals/solutions/8379225/kotlin-easy-by-pixelprince-0p9s
Problem      : 1288. Remove Covered Intervals
Day          : 279
Date         : 2026-07-06
*/

class Solution{
    fun removeCoveredIntervals(a:Array<IntArray>):Int{
        a.sortWith(compareBy<IntArray>{it[0]}.thenByDescending{it[1]})
        var r=0;var m=0
        for((_,x) in a)if(x>m){m=x;r++}
        return r
    }
}