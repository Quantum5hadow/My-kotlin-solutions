/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rank-transform-of-an-array/solutions/8391144/kotlin-easy-by-pixelprince-jtnf
Problem      : 1331. Rank Transform of an Array
Day          : 285
Date         : 2026-07-12
*/

class Solution{
    fun arrayRankTransform(a:IntArray)=
        a.toSortedSet().withIndex().associate{it.value to it.index+1}.let{
            a.map(it::getValue).toIntArray()
        }
}