/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/solutions/8313680/kotlin-easy-by-pixelprince-thbj
Problem      : 3751. Total Waviness of Numbers in Range I
Day          : 247
Date         : 2026-06-04
*/

class Solution{
    fun totalWaviness(a:Int,b:Int)=
        (a..b).sumOf{it.toString().windowed(3).count{w->(w[0]-w[1])*(w[2]-w[1])>0}}
}