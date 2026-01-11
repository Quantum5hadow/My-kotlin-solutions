/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-time-visiting-all-points/solutions/7582301/minimum-time-visiting-all-points-by-pixe-eqwt
Problem      : 1266. Minimum Time Visiting All Points
Day          : 103
Date         : 2026-01-11
*/





class Solution {
    fun minTimeToVisitAllPoints(p: Array<IntArray>): Int {
        var a = 0
        for (i in 1 until p.size) {
            val dx = kotlin.math.abs(p[i][0] - p[i-1][0])
            val dy = kotlin.math.abs(p[i][1] - p[i-1][1])
            a += if (dx > dy) dx else dy
        }
        return a
    }
}