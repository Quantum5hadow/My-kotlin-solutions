/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/solutions/8456204/kotlin-easy-by-pixelprince-r4nn
Problem      : 2958. Length of Longest Subarray With at Most K Frequency
Day          : 316
Date         : 2026-08-12
*/

class Solution{
    fun maxSubarrayLength(a:IntArray,k:Int):Int{
        val m=HashMap<Int,Int>();var l=0;var r=0
        for(i in a.indices){
            m[a[i]]=m.getOrDefault(a[i],0)+1
            while(m[a[i]]!!>k)m[a[l++]] = m[a[l-1]]!!-1
            r=maxOf(r,i-l+1)
        }
        return r
    }
}