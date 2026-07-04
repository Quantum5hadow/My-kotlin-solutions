/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/solutions/8375940/kotlin-easy-by-pixelprince-7nrt
Problem      : 2492. Minimum Score of a Path Between Two Cities
Day          : 277
Date         : 2026-07-04
*/

class Solution{
    fun minScore(n:Int,r:Array<IntArray>):Int{
        val p=IntArray(n+1){it}
        fun f(x:Int):Int=if(x==p[x])x else f(p[x]).also{p[x]=it}
        r.forEach{p[f(it[0])]=f(it[1])}
        return r.filter{f(it[0])==f(1)}.minOf{it[2]}
    }
}