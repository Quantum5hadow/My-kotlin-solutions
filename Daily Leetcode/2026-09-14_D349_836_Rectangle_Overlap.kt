/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rectangle-overlap/solutions/8520346/kotlin-easy-by-pixelprince-32nf
Problem      : 836. Rectangle Overlap
Day          : 349
Date         : 2026-09-14
*/

class Solution{
    fun isRectangleOverlap(a:IntArray,b:IntArray)=
        a[0]<b[2]&&b[0]<a[2]&&a[1]<b[3]&&b[1]<a[3]
}