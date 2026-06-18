/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/angle-between-hands-of-a-clock/solutions/8348725/kotlin-easy-by-pixelprince-7fl6
Problem      : 1344. Angle Between Hands of a Clock
Day          : 261
Date         : 2026-06-18
*/

class Solution{
    fun angleClock(h:Int,m:Int):Double{
        val d=kotlin.math.abs(h*30+m/2.0-m*6)
        return minOf(d,360-d)
    }
}