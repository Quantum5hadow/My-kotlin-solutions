/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-zigzag-arrays-i/solutions/8353343/kotlin-easy-by-pixelprince-atlm
Problem      : 3699. Number of ZigZag Arrays I
Day          : 266
Date         : 2026-06-23
*/

class Solution{
    fun zigZagArrays(n:Int,l:Int,r:Int):Int{
        val m=r-l+1;val mod=1_000_000_007L
        var u=LongArray(m){it.toLong()}
        var d=LongArray(m){(m-1-it).toLong()}
        repeat(n-2){
            val nu=LongArray(m);val nd=LongArray(m)
            var p=0L;for(i in u.indices){nu[i]=p;p=(p+d[i])%mod}
            p=0;for(i in m-1 downTo 0){nd[i]=p;p=(p+u[i])%mod}
            u=nu;d=nd
        }
        return ((u.sum()+d.sum())%mod).toInt()
    }
}