/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/paths-in-matrix-whose-sum-is-divisible-by-k/solutions/7581458/2435-paths-in-matrix-whose-sum-is-divisi-o4yw
Problem     : 2435. Paths in Matrix Whose Sum Is Divisible by K

Day         : 57
Date        : 2025-11-26
*/


class Solution {
    private val mod = (1e9 + 7).toInt()
    private var row = 0
    private var col = 0
    private lateinit var cache: Array<Array<IntArray>>

    fun numberOfPaths(grid: Array<IntArray>, k: Int): Int {
        row = grid.size
        col = grid[0].size
        cache = Array(row) { Array(col) { IntArray(k) { -1 } } }

        return numberOfPaths(grid, 0, 0, k, 0)
    }

    
    private fun numberOfPaths(grid: Array<IntArray>, r: Int, c: Int, k: Int, remainder: Int): Int {
        if (r to c !in grid) return 0
        if (cache[r][c][remainder] != -1) return cache[r][c][remainder]
        if (r == row - 1 && c == col - 1) {
            return if (grid[r][c] % k == remainder) 1 else 0
        }

        return ((remainder - grid[r][c] + 100 * k) % k).let {
            (numberOfPaths(grid, r + 1, c, k, it) + numberOfPaths(grid, r, c + 1, k, it)) % mod
        }.also {
            cache[r][c][remainder] = it
        }
    }

    private operator fun Array<IntArray>.contains(pair: Pair<Int, Int>): Boolean {
        return (0 <= pair.first && pair.first < this.size) &&
            (0 <= pair.second && pair.second < this[0].size)
    }
}