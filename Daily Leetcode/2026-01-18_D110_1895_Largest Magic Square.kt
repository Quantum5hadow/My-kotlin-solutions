/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/largest-magic-square/solutions/7583334/largest-magic-square-easy-by-pixelprince-pnfi
Problem      : 1895. Largest Magic Square
Day          : 110
Date         : 2026-01-18
*/
class Solution {
    fun largestMagicSquare(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        val row = Array(m) { IntArray(n + 1) }
        val col = Array(m + 1) { IntArray(n) }

        for (i in 0 until m) {
            for (j in 0 until n) {
                row[i][j + 1] = row[i][j] + grid[i][j]
                col[i + 1][j] = col[i][j] + grid[i][j]
            }
        }

        val maxSide = minOf(m, n)
        for (side in maxSide downTo 2) {
            for (i in 0..m - side) {
                for (j in 0..n - side) {
                    if (isMagic(grid, row, col, i, j, side)) {
                        return side
                    }
                }
            }
        }
        return 1
    }

    private fun isMagic(
        grid: Array<IntArray>,
        row: Array<IntArray>,
        col: Array<IntArray>,
        r: Int,
        c: Int,
        side: Int
    ): Boolean {
        val target = row[r][c + side] - row[r][c]
        var d1 = 0
        var d2 = 0

        for (k in 0 until side) {
            d1 += grid[r + k][c + k]
            d2 += grid[r + side - 1 - k][c + k]

            if (row[r + k][c + side] - row[r + k][c] != target) return false
            if (col[r + side][c + k] - col[r][c + k] != target) return false
        }
        return d1 == target && d2 == target
    }
}