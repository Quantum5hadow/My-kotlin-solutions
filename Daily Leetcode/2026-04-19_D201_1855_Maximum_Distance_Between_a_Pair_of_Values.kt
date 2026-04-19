/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/solutions/7993708/kotlin-easy-by-pixelprince-xnik
Problem      : 1855. Maximum Distance Between a Pair of Values
Day          : 201
Date         : 2026-04-19
*/

class Solution{
    fun maxDistance(a:IntArray,b:IntArray):Int{
        var i=0;var j=0;var ans=0
        while(i<a.size&&j<b.size){
            if(a[i]>b[j])i++
            else{ans=maxOf(ans,j-i);j++}
        }
        return ans
    }
}