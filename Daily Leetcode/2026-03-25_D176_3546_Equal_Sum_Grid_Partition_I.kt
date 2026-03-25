/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/equal-sum-grid-partition-i/solutions/7690973/kotlin-easy-by-pixelprince-sdez
Problem      : 3546. Equal Sum Grid Partition I
Day          : 176
Date         : 2026-03-25
*/

class Solution{
    fun canPartitionGrid(g:Array<IntArray>):Boolean{
        val m=g.size;val n=g[0].size
        var tot=0L
        for(r in g)for(v in r)tot+=v
        if(tot%2L!=0L)return false
        val t=tot/2;var s=0L
        for(i in 0 until m-1){for(v in g[i])s+=v;if(s==t)return true}
        s=0L
        for(j in 0 until n-1){
            for(i in 0 until m)s+=g[i][j]
            if(s==t)return true
        }
        return false
    }
}
