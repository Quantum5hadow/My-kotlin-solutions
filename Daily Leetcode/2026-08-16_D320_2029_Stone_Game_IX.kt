/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game-ix/solutions/8464618/kotlin-easy-by-pixelprince-hb98
Problem      : 2029. Stone Game IX
Day          : 320
Date         : 2026-08-16
*/

class Solution{
    fun stoneGameIX(a:IntArray)=a.map{it%3}.groupingBy{it}.eachCount().let{
        if((it[0]?:0)%2==0)(it[1]?:0)>0&&(it[2]?:0)>0
        else abs((it[1]?:0)-(it[2]?:0))>2
    }
}