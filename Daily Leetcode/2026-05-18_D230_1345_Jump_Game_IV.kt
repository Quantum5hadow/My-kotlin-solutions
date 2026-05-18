/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/jump-game-iv/solutions/8262906/kotlin-easy-by-pixelprince-y3s8
Problem      : 1345. Jump Game IV
Day          : 230
Date         : 2026-05-18
*/

class Solution{
    fun minJumps(a:IntArray):Int{
        val g=HashMap<Int,MutableList<Int>>()
        for(i in a.indices)g.computeIfAbsent(a[i]){ArrayList()}.add(i)
        val q=ArrayDeque<Int>();val v=BooleanArray(a.size)
        q.add(0);v[0]=true;var d=0
        while(q.isNotEmpty()){
            repeat(q.size){
                val i=q.removeFirst()
                if(i==a.lastIndex)return d
                for(j in intArrayOf(i-1,i+1))if(j in a.indices&&!v[j]){v[j]=true;q.add(j)}
                g[a[i]]?.forEach{if(!v[it]){v[it]=true;q.add(it)}};g.remove(a[i])
            };d++
        }
        return -1
    }
}