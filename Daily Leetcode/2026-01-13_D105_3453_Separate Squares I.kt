/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/separate-squares-i/solutions/7582303/separate-squares-i-easy-by-pixelprince-cqvm
Problem      : 3453. Separate Squares I
Day          : 105
Date         : 2026-01-13
*/

class Solution {
    fun separateSquares(sq: Array<IntArray>): Double {
        var lo = 1e18
        var hi = -1e18
        var total = 0.0
        for (s in sq) {
            lo = minOf(lo, s[1].toDouble())
            hi = maxOf(hi, (s[1] + s[2]).toDouble())
            total += 1.0 * s[2] * s[2]
        }

        repeat(80) {
            val mid = (lo + hi) / 2
            var below = 0.0
            for (s in sq) {
                val y = s[1].toDouble()
                val z = s[2].toDouble()
                if (mid > y) below += z * minOf(z, mid - y)
            }
            if (below * 2 >= total) hi = mid else lo = mid
        }
        return lo
    }
}