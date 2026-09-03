/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/construct-uniform-parity-array-ii/solutions/8499158/kotlin-easy-by-pixelprince-058k
Problem      : 3876. Construct Uniform Parity Array II
Day          : 338
Date         : 2026-09-03
*/

class Solution{
    fun uniformArray(a:IntArray)=
        a.partition{it and 1==0}.let{(e,o)->o.isEmpty()||e.isEmpty()||o.min()<e.min()}
}