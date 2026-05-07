/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/jump-game-ix/solutions/8255890/kotlin-easy-by-pixelprince-g8k5
Problem      : 3660. Jump Game IX
Day          : 219
Date         : 2026-05-07
*/

class Solution{
    fun maxValue(a:IntArray):IntArray{
        val n=a.size;val p=IntArray(n);val s=IntArray(n)
        p[0]=a[0];for(i in 1 until n)p[i]=maxOf(p[i-1],a[i])
        s[n-1]=a[n-1];for(i in n-2 downTo 0)s[i]=minOf(s[i+1],a[i])
        val r=IntArray(n);r[n-1]=p[n-1]
        for(i in n-2 downTo 0)r[i]=if(p[i]>s[i+1])r[i+1]else p[i]
        return r
    }
}