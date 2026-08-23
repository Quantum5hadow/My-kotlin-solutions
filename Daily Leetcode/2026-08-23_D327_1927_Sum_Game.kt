/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sum-game/solutions/8483749/kotlin-easy-by-pixelprince-odwo
Problem      : 1927. Sum Game
Day          : 327
Date         : 2026-08-23
*/

class Solution{
    fun sumGame(s:String):Boolean{
        val h=s.length/2
        val a=s.take(h)
        val b=s.drop(h)
        val qa=a.count{it=='?'}-b.count{it=='?'}
        val sa=a.filter{it!='?'}.sumOf{it-'0'}
        val sb=b.filter{it!='?'}.sumOf{it-'0'}
        return qa%2!=0||sa-sb+qa*9/2!=0
    }
}