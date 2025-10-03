/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/trapping-rain-water-ii/solutions/7574664/trapping-rain-water-ii-by-pixelprince-9n4m/

Problem     : 407. Trapping Rain Water II
Day         : 03
Date        : 2025-10-03
*/

class Solution {
    fun trapRainWater(heightMap: Array<IntArray>): Int {
        val dirs = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(-1, 0))
        val m = heightMap.size
        val n = heightMap[0].size
        var ans = 0
        val minHeap = PriorityQueue(Comparator { a: IntArray, b: IntArray -> a[0] - b[0] })
        val seen = hashSetOf<Pair<Int, Int>>()

        for (i in 0 until m) {
            minHeap.add(intArrayOf(heightMap[i][0], i, 0))
            minHeap.add(intArrayOf(heightMap[i][n - 1], i, n - 1))
            seen.add(Pair(i, 0))
            seen.add(Pair(i, n - 1))
        }

        for (j in 1 until n - 1) {
            minHeap.add(intArrayOf(heightMap[0][j], 0, j))
            minHeap.add(intArrayOf(heightMap[m - 1][j], m - 1, j))
            seen.add(Pair(0, j))
            seen.add(Pair(m - 1, j))
        }

        while (minHeap.isNotEmpty()) {
            val (h, i, j) = minHeap.poll()
            for ((dx, dy) in dirs) {
                val x = i + dx
                val y = j + dy
                if (x < 0 || x == m || y < 0 || y == n) continue
                if (Pair(x, y) in seen) continue
                if (heightMap[x][y] < h) {
                    ans += h - heightMap[x][y]
                    minHeap.add(intArrayOf(h, x, y))
                } else {
                    minHeap.add(intArrayOf(heightMap[x][y], x, y))
                }
                seen.add(Pair(x, y))
            }
        }
        return ans
    }
}