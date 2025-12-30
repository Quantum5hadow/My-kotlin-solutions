/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/magic-squares-in-grid/solutions/7581809/magic-squares-in-grid-easy-by-pixelprinc-bco8
Problem     : 840. Magic Squares In Grid
Day         : 91
Date        : 2025-12-30
*/

class Solution {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var count = 0
        for (i in 0 until m - 2) {
            for (j in 0 until n - 2) {
                val set: MutableSet<Int> = HashSet()
                val sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                if (sum == grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] && sum == grid[i + 2][j] +
                    grid[i + 2][j + 1] + grid[i + 2][j + 2] && sum == grid[i][j] + grid[i + 1][j] + grid[i + 2][j] &&
                    sum == grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] && sum == grid[i][j + 2] +
                    grid[i + 1][j + 2] + grid[i + 2][j + 2] && sum == grid[i][j] + grid[i + 1][j + 1] +
                    grid[i + 2][j + 2] && sum == grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] && set.add(
                        grid[i][j],
                    ) &&
                    isLegit(grid[i][j]) &&
                    set.add(grid[i][j + 1]) &&
                    isLegit(grid[i][j + 1]) &&
                    set.add(grid[i][j + 2]) &&
                    isLegit(grid[i][j + 2]) &&
                    set.add(grid[i + 1][j]) &&
                    isLegit(grid[i + 1][j]) &&
                    set.add(grid[i + 1][j + 1]) &&
                    isLegit(grid[i + 1][j + 1]) &&
                    set.add(grid[i + 1][j + 2]) &&
                    isLegit(grid[i + 1][j + 2]) &&
                    set.add(grid[i + 2][j]) &&
                    isLegit(grid[i + 2][j]) &&
                    set.add(grid[i + 2][j + 1]) &&
                    isLegit(grid[i + 2][j + 1]) &&
                    set.add(grid[i + 2][j + 2]) &&
                    isLegit(grid[i + 2][j + 2])
                ) {
                    count++
                }
            }
        }
        return count
    }

    private fun isLegit(num: Int): Boolean {
        return num in 1..9
    }
}

