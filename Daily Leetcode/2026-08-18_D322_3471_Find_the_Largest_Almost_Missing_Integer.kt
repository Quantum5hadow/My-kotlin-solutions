/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-largest-almost-missing-integer/solutions/8468359/kotlin-easy-by-pixelprince-atjz
Problem      : 3471. Find the Largest Almost Missing Integer
Day          : 322
Date         : 2026-08-18
*/

class Solution{
    fun largestInteger(a:IntArray,k:Int)=
        a.toList().windowed(k).flatMap{it.toSet()}.groupingBy{it}.eachCount()
            .maxOfOrNull{(x,c)->if(c==1)x else -1}?:-1
}