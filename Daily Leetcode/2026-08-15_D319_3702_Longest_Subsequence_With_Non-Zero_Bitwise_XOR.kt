/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/solutions/8461880/kotlin-easy-by-pixelprince-cll1
Problem      : 3702. Longest Subsequence With Non-Zero Bitwise XOR
Day          : 319
Date         : 2026-08-15
*/

class Solution{
    fun longestSubsequence(a:IntArray)=
        if(a.all{it==0})0 else a.size-(a.reduce(Int::xor)==0).compareTo(false)
}