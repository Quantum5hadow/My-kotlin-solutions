/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-missing-multiple-of-k/solutions/8483752/kotlin-easy-by-pixelprince-d77b
Problem      : 3718. Smallest Missing Multiple of K
Day          : 329
Date         : 2026-08-25
*/

class Solution{
    fun missingMultiple(a:IntArray,k:Int)=
        (1..200/k).first{it*k !in a}*k
}