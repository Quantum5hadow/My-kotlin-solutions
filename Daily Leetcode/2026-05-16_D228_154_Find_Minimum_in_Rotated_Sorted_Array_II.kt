/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/solutions/8262868/kotlin-easy-by-pixelprince-ikos
Problem      : 154. Find Minimum in Rotated Sorted Array II
Day          : 228
Date         : 2026-05-16
*/

class Solution{
    fun findMin(a:IntArray):Int{
        var l=0;var r=a.lastIndex
        while(l<r){
            val m=(l+r)/2
            if(a[m]>a[r])l=m+1 else if(a[m]<a[r])r=m else r--
        }
        return a[l]
    }
}