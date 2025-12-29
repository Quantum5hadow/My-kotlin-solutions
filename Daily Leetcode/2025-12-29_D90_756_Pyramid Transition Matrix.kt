/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/pyramid-transition-matrix/solutions/7581803/pyramid-transition-matrix-easy-by-pixelp-vlv6
Problem     : 756. Pyramid Transition Matrix
Day         : 90
Date        : 2025-12-29
*/

class Solution {
    private fun dfs(c: CharArray, i: Int, l: Int, map: Array<IntArray>): Boolean {
        if (l == 1) {
            return true
        }
        if (i == l - 1) {
            return dfs(c, 0, l - 1, map)
        }
        val save = c[i]
        var p = 'A'
        var v = map[c[i].code - 'A'.code][c[i + 1].code - 'A'.code]
        while (v != 0) {
            if (v and 1 != 0) {
                c[i] = p
                if (dfs(c, i + 1, l, map)) {
                    return true
                }
            }
            v = v shr 1
            p++
        }
        c[i] = save
        return false
    }

    fun pyramidTransition(bottom: String, allowed: List<String>): Boolean {
        val map = Array(7) { IntArray(7) }
        for (s in allowed) {
            map[s[0].code - 'A'.code][s[1].code - 'A'.code] =
                map[s[0].code - 'A'.code][s[1].code - 'A'.code] or (1 shl s[2].code - 'A'.code)
        }
        return dfs(bottom.toCharArray(), 0, bottom.length, map)
    }
}