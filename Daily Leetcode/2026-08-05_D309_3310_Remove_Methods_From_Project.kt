/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/remove-methods-from-project/solutions/8442103/kotlin-easy-by-pixelprince-fkrv
Problem      : 3310. Remove Methods From Project
Day          : 309
Date         : 2026-08-05
*/

class Solution{
    fun remainingMethods(n:Int,k:Int,inv:Array<IntArray>):List<Int>{
        val g=Array(n){mutableListOf<Int>()}
        val v=BooleanArray(n)
        inv.forEach{g[it[0]]+=it[1]}
        fun dfs(x:Int){
            if(v[x])return
            v[x]=true
            g[x].forEach(::dfs)
        }
        dfs(k)
        return if(inv.any{v[it[1]]&&!v[it[0]]})(0 until n).toList()
        else (0 until n).filter{!v[it]}
    }
}