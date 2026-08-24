/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game-viii/solutions/8483751/kotlin-easy-by-pixelprince-5enu
Problem      : 1872. Stone Game VIII
Day          : 328
Date         : 2026-08-24
*/

class Solution{
    fun stoneGameVIII(a:IntArray)=a.scan(0,Int::plus).run{
        (size-2 downTo 2).fold(last()){x,i->maxOf(x,this[i]-x)}
    }
}