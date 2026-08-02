/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game/solutions/8435889/kotlin-easy-by-pixelprince-gwqh
Problem      : 877. Stone Game
Day          : 306
Date         : 2026-08-02
*/

class Solution{
    fun stoneGame(a:IntArray):Boolean{
        val d=a.clone()
        for(i in a.lastIndex-1 downTo 0)
            for(j in i+1..a.lastIndex)
                d[j]=maxOf(a[i]-d[j],a[j]-d[j-1])
        return d.last()>0
    }
}