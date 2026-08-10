/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/stone-game-iv/solutions/8452179/kotlin-easy-by-pixelprince-e16u
Problem      : 1510. Stone Game IV
Day          : 314
Date         : 2026-08-10
*/

class Solution{
    fun winnerSquareGame(n:Int):Boolean{
        val d=BooleanArray(n+1)
        for(i in 1..n)d[i]=(1..i).any{it<=i/it&&!d[i-it*it]}
        return d[n]
    }
}