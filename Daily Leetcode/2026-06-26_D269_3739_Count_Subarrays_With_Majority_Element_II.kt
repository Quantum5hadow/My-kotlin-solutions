/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-subarrays-with-majority-element-ii/solutions/8359221/kotlin-easy-by-pixelprince-pf3b
Problem      : 3739. Count Subarrays With Majority Element II
Day          : 269
Date         : 2026-06-26
*/

class Solution{
    fun countMajoritySubarrays(a:IntArray,t:Int):Long{
        val n=a.size;val f=IntArray(n*2+1)
        fun add(i:Int){var x=i;while(x<f.size){f[x]++;x=x or(x+1)}}
        fun sum(i:Int):Int{var x=i;var s=0;while(x>=0){s+=f[x];x=(x and(x+1))-1};return s}
        var c=0;var ans=0L
        add(n)
        for(x in a){
            c+=if(x==t)1 else -1
            add(n+c);ans+=sum(n+c-1)
        }
        return ans
    }
}