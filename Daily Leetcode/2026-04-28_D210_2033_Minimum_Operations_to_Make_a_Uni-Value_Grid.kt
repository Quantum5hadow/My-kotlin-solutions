
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/solutions/8106902/kotlin-easy-by-pixelprince-mmcn
Problem      : 2033. Minimum Operations to Make a Uni-Value Grid
Day          : 210
Date         : 2026-04-28


class Solution{
    fun minOperations(g:Array<IntArray>,x:Int):Int{
        val a=g.flatMap{it.toList()}
        val r=a[0]%x;if(a.any{it%x!=r})return -1
        val b=a.map{it/x}.sorted();val m=b[b.size/2]
        return b.sumOf{ kotlin.math.abs(it-m) }
    }
}
