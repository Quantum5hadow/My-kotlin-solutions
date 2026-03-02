/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/solutions/7619887/kotlin-easy-by-pixelprince-y23v
Problem      : 1536. Minimum Swaps to Arrange a Binary Grid
Day          : 153
Date         : 2026-03-02
*/

class Solution {
    fun minSwaps(grid: Array<IntArray>): Int {
        val n = grid.size
        val z = IntArray(n)
        for (i in 0 until n) {
            var c = 0
            for (j in n - 1 downTo 0) {
                if (grid[i][j] == 0) c++ else break
            }
            z[i] = c
        }
        var ans = 0
        for (i in 0 until n) {
            var j = i
            while (j < n && z[j] < n - i - 1) j++
            if (j == n) return -1
            while (j > i) {
                val t = z[j]; z[j] = z[j - 1]; z[j - 1] = t
                ans++; j--
            }
        }
        return ans
    }
}
