/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/8285910/kotlin-easy-by-pixelprince-sii3
Problem      : 33. Search in Rotated Sorted Array
Day          : 234
Date         : 2026-05-22
*/

class Solution{
    fun search(a:IntArray,t:Int):Int{
        var l=0;var r=a.lastIndex
        while(l<=r){
            val m=(l+r)/2
            if(a[m]==t)return m
            if(a[l]<=a[m])
                if(t in a[l]..<a[m])r=m-1 else l=m+1
            else
                if(t in a[m]+1..a[r])l=m+1 else r=m-1
        }
        return -1
    }
}