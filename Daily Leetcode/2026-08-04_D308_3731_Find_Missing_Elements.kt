/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-missing-elements/solutions/8439641/kotlin-easy-by-pixelprince-9nax
Problem      : 3731. Find Missing Elements
Day          : 308
Date         : 2026-08-04
*/

class Solution{
    fun findMissingElements(a:IntArray)=
        (a.min()..a.max()).filter{it !in a.toSet()}
}