/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/path-existence-queries-in-a-graph-i/solutions/8386014/kotlin-easy-by-pixelprince-kufh
Problem      : 3532. Path Existence Queries in a Graph I
Day          : 282
Date         : 2026-07-09
*/

class Solution{
    fun pathExistenceQueries(n:Int,a:IntArray,m:Int,q:Array<IntArray>):List<Boolean>{
        val id=IntArray(n)
        for(i in 1 until n)id[i]=id[i-1]+(a[i]-a[i-1]>m).compareTo(false)
        return q.map{id[it[0]]==id[it[1]]}
    }
}