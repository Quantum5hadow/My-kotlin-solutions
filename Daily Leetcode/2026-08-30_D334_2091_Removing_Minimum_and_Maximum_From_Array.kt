/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/removing-minimum-and-maximum-from-array/solutions/8491286/kotlin-easy-by-pixelprince-0139
Problem      : 2091. Removing Minimum and Maximum From Array
Day          : 334
Date         : 2026-08-30
*/

class Solution{
    fun minimumDeletions(a:IntArray)=a.run{
        val(x,y)=listOf(indexOf(min()),indexOf(max())).sorted()
        minOf(y+1,size-x,x+1+size-y)
    }
}