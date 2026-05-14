/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-if-array-is-good/solutions/8262805/kotlin-easy-by-pixelprince-8vb3
Problem      : 2784. Check if Array is Good
Day          : 226
Date         : 2026-05-14
*/

class Solution{
    fun isGood(a:IntArray):Boolean{
        val n=a.size;val c=IntArray(n)
        for(x in a){
            if(x>=n||x==n-1&&c[x]==2||x<n-1&&c[x]==1)return false
            c[x]++
        }
        return true
    }
}