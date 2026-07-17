/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sorted-gcd-pair-queries/solutions/8404984/kotlin-easy-by-pixelprince-vx10
Problem      : 3312. Sorted GCD Pair Queries
Day          : 290
Date         : 2026-07-17
*/

class Solution {
    fun gcdValues(nums: IntArray, queries: LongArray): IntArray {
        val mx = nums.max()
        val cnt = IntArray(mx + 1)

        for (x in nums) {
            var d = 1
            while (d * d <= x) {
                if (x % d == 0) {
                    cnt[d]++
                    if (d * d != x) cnt[x / d]++
                }
                d++
            }
        }

        val exact = LongArray(mx + 1)
        for (g in mx downTo 1) {
            exact[g] = 1L * cnt[g] * (cnt[g] - 1) / 2
            var k = g shl 1
            while (k <= mx) {
                exact[g] -= exact[k]
                k += g
            }
        }

        for (i in 1..mx) exact[i] += exact[i - 1]

        return IntArray(queries.size) {
            var l = 1
            var r = mx
            while (l < r) {
                val m = (l + r) ushr 1
                if (exact[m] > queries[it]) r = m
                else l = m + 1
            }
            l
        }
    }
}