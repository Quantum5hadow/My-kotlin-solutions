/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-cost-path-with-teleportations/solutions/7583407/minimum-cost-path-with-teleportations-ea-v8t7
Problem      : 3651. Minimum Cost Path with Teleportations
Day          : 120
Date         : 2026-01-28
*/

class Solution {
    fun minCost(g: Array<IntArray>, K: Int): Int {
        val h = g.size
        val w = g[0].size
        val pq = PriorityQueue<IntArray> { a, b -> a[3] - b[3] }
        val INF = 1 shl 30
        val dist = Array(h) { Array(w) { IntArray(K + 1) { INF } } }

        val ord = (0 until h * w).sortedBy { g[it / w][it % w] }
        val ptr = IntArray(K + 1)

        pq.add(intArrayOf(0, 0, K, 0))
        dist[0][0][K] = 0

        while (pq.isNotEmpty()) {
            val (x, y, k, c) = pq.poll()
            if (c != dist[y][x][k]) continue
            if (x == w - 1 && y == h - 1) return c

            if (x + 1 < w && dist[y][x + 1][k] > c + g[y][x + 1]) {
                dist[y][x + 1][k] = c + g[y][x + 1]
                pq.add(intArrayOf(x + 1, y, k, dist[y][x + 1][k]))
            }
            if (y + 1 < h && dist[y + 1][x][k] > c + g[y + 1][x]) {
                dist[y + 1][x][k] = c + g[y + 1][x]
                pq.add(intArrayOf(x, y + 1, k, dist[y + 1][x][k]))
            }

            if (k > 0) {
                while (ptr[k] < ord.size) {
                    val id = ord[ptr[k]]
                    val ny = id / w
                    val nx = id % w
                    if (g[ny][nx] > g[y][x]) break
                    if (c < dist[ny][nx][k - 1]) {
                        dist[ny][nx][k - 1] = c
                        pq.add(intArrayOf(nx, ny, k - 1, c))
                    }
                    ptr[k]++
                }
            }
        }
        return -1
    }
}
