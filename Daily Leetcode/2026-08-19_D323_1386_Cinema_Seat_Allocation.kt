/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/cinema-seat-allocation/solutions/8469887/kotlin-easy-by-pixelprince-1nyk
Problem      : 1386. Cinema Seat Allocation
Day          : 323
Date         : 2026-08-19
*/

class Solution{
    fun maxNumberOfFamilies(n:Int,r:Array<IntArray>)=2*n-r.groupBy{it[0]}.values.map{
        val m=it.sumOf{1 shl it[1]}
        when{
            m and 60==0&&m and 960==0->0
            m and 60==0||m and 960==0||m and 240==0->1
            else->2
        }
    }.sum()
}