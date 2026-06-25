/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-subarrays-with-majority-element-i/solutions/8357798/kotlin-easy-by-pixelprince-2mn0
Problem      : 3737. Count Subarrays With Majority Element I
Day          : 268
Date         : 2026-06-25
*/

class Solution{
    fun countMajoritySubarrays(a:IntArray,t:Int):Long{
        var r=0L
        for(i in a.indices){
            var s=0
            for(j in i downTo 0){
                s+=if(a[j]==t)1 else -1
                if(s>0)r++
            }
        }
        return r
    }
}