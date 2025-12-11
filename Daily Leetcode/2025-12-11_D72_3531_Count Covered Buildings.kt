
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-covered-buildings/solutions/7581610/3531-count-covered-buildings-easy-by-pix-f28x
Problem     : 3531. Count Covered Buildings
Day         : 72
Date        : 2025-12-11
*/

class Solution {
    private fun helper(buildings: Array<IntArray>, n: Int): Int {
        val minRow = IntArray(n + 1)
        val maxRow = IntArray(n + 1)
        val minCol = IntArray(n + 1)
        val maxCol = IntArray(n + 1)
        minRow.fill(n + 1)
        minCol.fill(n + 1)
        for (b in buildings) {
            val x = b[0]
            val y = b[1]
            minRow[x] = min(minRow[x], y)
            maxRow[x] = max(maxRow[x], y)
            minCol[y] = min(minCol[y], x)
            maxCol[y] = max(maxCol[y], x)
        }
        var ans = 0
        for (arr in buildings) {
            val x = arr[0]
            val y = arr[1]
            if (minRow[x] < y && maxRow[x] > y && minCol[y] < x && maxCol[y] > x) {
                ans++
            }
        }
        return ans
    }

    fun countCoveredBuildings(n: Int, buildings: Array<IntArray>): Int {
        return helper(buildings, n)
    }
}