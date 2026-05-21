/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/solutions/8283505/kotlin-easy-by-pixelprince-e3e3
Problem      : 3043. Find the Length of the Longest Common Prefix
Day          : 233
Date         : 2026-05-21
*/

class Solution{
    fun longestCommonPrefix(a:IntArray,b:IntArray):Int{
        val s=hashSetOf<Int>()
        for(x in a){var v=x;while(v>0){s+=v;v/=10}}
        return b.maxOf{
            var v=it
            while(v>0&&v !in s)v/=10
            "$v".length*(v>0).compareTo(false)
        }
    }
}