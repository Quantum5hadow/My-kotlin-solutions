/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-distance-to-the-target-element/solutions/7921390/kotlin-easy-by-pixelprince-by3g
Problem      : 1848. Minimum Distance to the Target Element
Day          : 195
Date         : 2026-04-13
*/

class Solution{
    fun getMinDistance(a:IntArray,t:Int,s:Int):Int{
        for(d in 0..a.size)
            if((s-d>=0&&a[s-d]==t)||(s+d<a.size&&a[s+d]==t))
                return d
        return -1
    }
}