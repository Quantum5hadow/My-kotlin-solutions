/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/solutions/7583342/maximum-side-length-of-a-square-with-sum-xozu
Problem      : 1292. Maximum Side Length of a Square with Sum Less than or Equal to Threshold
Day          : 111
Date         : 2026-01-19
*/

class Solution {
    fun maxSideLength(mat: Array<IntArray>, t: Int): Int {
        val m = mat.size
        val n = mat[0].size
        val ps = Array(m + 1) { IntArray(n + 1) }
        var s = 0

        for (i in 0 until m) {
            for (j in 0 until n) {
                ps[i + 1][j + 1] =
                    ps[i][j + 1] + ps[i + 1][j] - ps[i][j] + mat[i][j]

                if (i >= s && j >= s) {
                    val sum =
                        ps[i + 1][j + 1] -
                        ps[i - s][j + 1] -
                        ps[i + 1][j - s] +
                        ps[i - s][j - s]

                    if (sum <= t) s++
                }
            }
        }
        return s
    }
}