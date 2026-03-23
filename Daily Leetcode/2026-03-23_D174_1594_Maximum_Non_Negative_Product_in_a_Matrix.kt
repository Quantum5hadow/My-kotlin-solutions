/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-non-negative-product-in-a-matrix/solutions/7683626/kotlin-easy-by-pixelprince-6umr
Problem      : 1594. Maximum Non Negative Product in a Matrix
Day          : 174
Date         : 2026-03-23
*/

class Solution{
    fun maxProductPath(g:Array<IntArray>):Int{
        val n=g[0].size;val mn=LongArray(n);val mx=LongArray(n)
        mn[0]=g[0][0].toLong();mx[0]=mn[0]
        for(j in 1 until n){mn[j]=mn[j-1]*g[0][j];mx[j]=mn[j]}
        for(i in 1 until g.size){
            mn[0]*=g[i][0];mx[0]=mn[0]
            for(j in 1 until n){
                val v=g[i][j];val a=mn[j];val b=mx[j];val c=mn[j-1];val d=mx[j-1]
                val lo=minOf(a,c);val hi=maxOf(b,d)
                if(v<0){mn[j]=v*hi;mx[j]=v*lo}else{mn[j]=v*lo;mx[j]=v*hi}
            }
        }
        return if(mx[n-1]<0)-1 else (mx[n-1]%1_000_000_007).toInt()
    }
}

