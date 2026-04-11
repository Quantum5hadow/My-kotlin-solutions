/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/solutions/7921338/kotlin-easy-by-pixelprince-9uty
Problem      : 3741. Minimum Distance Between Three Equal Elements II
Day          : 193
Date         : 2026-04-11
*/

class Solution{
    fun minimumDistance(a:IntArray):Int{
        val m=HashMap<Int,MutableList<Int>>()
        for(i in a.indices)m.computeIfAbsent(a[i]){mutableListOf()}.add(i)
        var ans=Int.MAX_VALUE
        for(v in m.values)for(i in 0 until v.size-2)
            ans=minOf(ans,2*(v[i+2]-v[i]))
        return if(ans==Int.MAX_VALUE)-1 else ans
    }
}