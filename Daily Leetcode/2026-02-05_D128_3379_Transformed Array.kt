/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/transformed-array/solutions/7583449/transformed-array-easy-by-pixelprince-atni
Problem      : 3379. Transformed Array
Day          : 128
Date         : 2026-02-05
*/

class Solution {
    fun constructTransformedArray(a: IntArray): IntArray =
        IntArray(a.size) { i -> a[(i + a[i]).mod(a.size)] }
}
