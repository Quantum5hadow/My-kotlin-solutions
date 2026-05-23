/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/solutions/8288116/kotlin-easy-by-pixelprince-q7dn
Problem      : 1752. Check if Array Is Sorted and Rotated
Day          : 235
Date         : 2026-05-23
*/

class Solution{
    fun check(a:IntArray)=
        a.indices.count{a[it]>a[(it+1)%a.size]}<2
}