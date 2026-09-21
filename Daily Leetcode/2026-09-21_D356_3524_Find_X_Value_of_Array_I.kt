/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-x-value-of-array-i/solutions/8532615/kotlin-easy-by-pixelprince-y5db
Problem      : 3524. Find X Value of Array I
Day          : 356
Date         : 2026-09-21
*/

class Solution{
    fun resultArray(a:IntArray,k:Int)=LongArray(k).also{res->
        var d=LongArray(k)
        for(x in a){
            val n=LongArray(k);val m=x%k
            n[m]++
            for(i in 0 until k)n[i*m%k]+=d[i]
            d=n
            for(i in 0 until k)res[i]+=d[i]
        }
    }
}