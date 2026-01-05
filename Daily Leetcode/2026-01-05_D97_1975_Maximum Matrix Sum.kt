/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-matrix-sum/solutions/7581868/maximum-matrix-sum-easy-by-pixelprince-wcmy
Problem     : 1975. Maximum Matrix Sum
Day         : 97
Date        : 2026-01-05
*/

class Solution {
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        var neg = 0
        var sum = 0L
        var minAbs = Int.MAX_VALUE

        for (row in matrix) {
            for (v in row) {
                if (v < 0) neg++
                val a = kotlin.math.abs(v)
                sum += a
                minAbs = minOf(minAbs, a)
            }
        }
        return if (neg % 2 == 0) sum else sum - 2L * minAbs
    }
}

