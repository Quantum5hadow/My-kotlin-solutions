/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-zigzag-arrays-ii/solutions/8355273/kotlin-easy-by-pixelprince-69n1
Problem      : 3700. Number of ZigZag Arrays II
Day          : 267
Date         : 2026-06-24
*/

class Solution{
    fun zigZagArrays(n:Int,l:Int,r:Int):Int{
        val m=r-l;var e=n-1
        var a=Array(m){LongArray(m)};var b=Array(m){LongArray(m)}
        for(i in 0 until m){a[i][i]=1;for(j in m-1 downTo m-1-i)b[i][j]=1}
        fun f(x:Array<LongArray>,y:Array<LongArray>)=Array(m){i->LongArray(m).also{z->
            for(k in 0 until m)if(x[i][k]>0)for(j in 0 until m)z[j]=(z[j]+x[i][k]*y[k][j])%1000000007
        }}
        while(e>0){if(e and 1>0)a=f(a,b);b=f(b,b);e/=2}
        return ((a.sumOf{it.sum()}*2)%1000000007).toInt()
    }
}