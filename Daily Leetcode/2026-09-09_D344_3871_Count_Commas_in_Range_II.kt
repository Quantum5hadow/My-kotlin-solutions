/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-commas-in-range-ii/solutions/8511499/kotlin-easy-by-pixelprince-7mob
Problem      : 3871. Count Commas in Range II
Day          : 344
Date         : 2026-09-09
*/

class Solution{
    fun countCommas(n:Long)=
        (1..5).sumOf{
            var p=1L
            repeat(it){p*=1000}
            maxOf(0,n-p+1)
        }
}