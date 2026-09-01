/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/solutions/8495038/kotlin-easy-by-pixelprince-dob0
Problem      : 3568. Minimum Moves to Clean the Classroom
Day          : 336
Date         : 2026-09-01
*/

class Solution {
    fun minMoves(g: Array<String>, E: Int): Int {
        val rows = g.size; val cols = g[0].length
        var sr = 0; var sc = 0; var bits = 0
        val litterId = Array(rows) { IntArray(cols) { -1 } }
        for (r in 0 until rows) for (c in 0 until cols) when (g[r][c]) {
            'S' -> { sr = r; sc = c }
            'L' -> litterId[r][c] = bits++
        }
        val full = (1 shl bits) - 1
        if (full == 0) return 0

        val states = full + 1
        fun key(r: Int, c: Int, m: Int) = (r * cols + c) * states + m

        val bestEnergy = HashMap<Int, Int>()
        bestEnergy[key(sr, sc, 0)] = E

        var frontier = mutableListOf(Triple(sr, sc, 0))
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)
        var moves = 0

        while (frontier.isNotEmpty()) {
            val next = mutableListOf<Triple<Int, Int, Int>>()
            for ((r, c, m) in frontier) {
                val e = bestEnergy[key(r, c, m)]!!
                if (e <= 0) continue          
                for (d in 0 until 4) {
                    val nr = r + dr[d]; val nc = c + dc[d]
                    if (nr !in 0 until rows || nc !in 0 until cols || g[nr][nc] == 'X') continue
                    val ne = if (g[nr][nc] == 'R') E else e - 1
                    val nm = if (litterId[nr][nc] >= 0) m or (1 shl litterId[nr][nc]) else m
                    if (nm == full) return moves + 1
                    val k = key(nr, nc, nm)
                    if ((bestEnergy[k] ?: -1) >= ne) continue
                    bestEnergy[k] = ne
                    next.add(Triple(nr, nc, nm))
                }
            }
            frontier = next
            moves++
        }
        return -1
    }
}