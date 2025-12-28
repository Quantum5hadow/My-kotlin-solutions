/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/solutions/7581794/count-negative-numbers-in-a-sorted-matri-nqyy
Problem     : 1351. Count Negative Numbers in a Sorted Matrix
Day         : 89
Date        : 2025-12-28
*/

class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for (row in grid) {
            for (v in row) {
                if (v < 0) {
                    count++
                }
            }
        }
        return count
    }
}
