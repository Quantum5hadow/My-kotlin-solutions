/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/solutions/8429345/kotlin-easy-by-pixelprince-ccsr
Problem      : 3014. Minimum Number of Pushes to Type Word I
Day          : 303
Date         : 2026-07-30
*/

class Solution{
    fun minimumPushes(w:String)=w.length.let{(it/8+1)*(4*(it/8)+it%8)}
}