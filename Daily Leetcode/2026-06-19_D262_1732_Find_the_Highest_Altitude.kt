/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-highest-altitude/solutions/8348728/kotlin-easy-by-pixelprince-dije
Problem      : 1732. Find the Highest Altitude
Day          : 262
Date         : 2026-06-19
*/

class Solution{
    fun largestAltitude(a:IntArray)=
        a.runningFold(0,Int::plus).max()
}