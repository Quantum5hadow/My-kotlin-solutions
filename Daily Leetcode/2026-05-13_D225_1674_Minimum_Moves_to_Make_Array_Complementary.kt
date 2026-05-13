/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-moves-to-make-array-complementary/solutions/8262727/kotlin-easy-by-pixelprince-b37h
Problem      : 1674. Minimum Moves to Make Array Complementary
Day          : 225
Date         : 2026-05-13
*/

class Solution{
    fun minMoves(a:IntArray,lim:Int):Int{
        val n=a.size;val d=IntArray(2*lim+2)
        for(i in 0 until n/2){
            val x=minOf(a[i],a[n-1-i]);val y=maxOf(a[i],a[n-1-i]);val s=x+y
            d[2]+=2;d[x+1]--;d[s]--;d[s+1]++;d[y+lim+1]++
        }
        var r=Int.MAX_VALUE;var cur=0
        for(i in 2 until d.size){cur+=d[i];if(cur<r)r=cur}
        return r
    }
}