/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/special-positions-in-a-binary-matrix/solutions/7624058/kotlin-easy-by-pixelprince-2lq8
Problem      : 1582. Special Positions in a Binary Matrix
Day          : 155
Date         : 2026-03-04
*/

class Solution{
    fun numSpecial(a:Array<IntArray>):Int{
        val m=a.size;val n=a[0].size
        val r=IntArray(m);val c=IntArray(n)
        for(i in 0 until m)for(j in 0 until n)if(a[i][j]==1){r[i]++;c[j]++}
        var ans=0
        for(i in 0 until m)for(j in 0 until n)
            if(a[i][j]==1&&r[i]==1&&c[j]==1)ans++
        return ans
    }
}
