/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-pair-removal-to-sort-array-ii/solutions/7583372/minimum-pair-removal-to-sort-array-ii-ea-42pv
Problem      : 3510. Minimum Pair Removal to Sort Array II
Day          : 115
Date         : 2026-01-23
*/

class Solution {
    fun minimumPairRemoval(nums: IntArray): Int {
        val n = nums.size
        if (n <= 1) return 0

        var size = 1
        while (size < n) size = size shl 1

        val seg = LongArray(size * 2 - 1) { Long.MAX_VALUE }
        val L = IntArray(size * 2 - 1)
        val R = IntArray(size * 2 - 1)
        val sum = LongArray(n)
        val ptr = Array(n) { intArrayOf(-1, -1) }

        var bad = 0
        sum[0] = nums[0].toLong()
        ptr[0] = intArrayOf(-1, size - 1)

        for (i in 1 until n) {
            if (nums[i] < nums[i - 1]) bad++
            val si = size + i - 2
            L[si] = i - 1
            R[si] = i
            seg[si] = nums[i - 1].toLong() + nums[i]
            sum[i] = nums[i].toLong()
            ptr[i] = intArrayOf(si, si + 1)
        }
        ptr[n - 1][1] = -1

        for (i in size - 2 downTo 0) seg[i] = minOf(seg[2 * i + 1], seg[2 * i + 2])

        var res = 0
        while (bad > 0) {
            var i = 0
            while (2 * i + 1 < seg.size) {
                val l = 2 * i + 1
                val r = 2 * i + 2
                i = if (seg[l] <= seg[r]) l else r
            }
            val a = L[i]
            val b = R[i]
            val la = sum[a]
            val rb = sum[b]
            if (la > rb) bad--

            sum[a] = la + rb
            val ns = sum[a]

            val lp = ptr[a][0]
            val rp = ptr[b][1]
            ptr[a][1] = rp

            if (lp != -1) {
                val x = L[lp]
                if (sum[x] > la && sum[x] <= ns) bad--
                else if (sum[x] <= la && sum[x] > ns) bad++
                update(seg, lp, sum[x] + ns)
            }
            if (rp != -1) {
                val y = R[rp]
                if (rb > sum[y] && ns <= sum[y]) bad--
                else if (rb <= sum[y] && ns > sum[y]) bad++
                update(seg, rp, ns + sum[y])
                L[rp] = a
            }
            update(seg, i, Long.MAX_VALUE)
            res++
        }
        return res
    }

    private fun update(seg: LongArray, i0: Int, v: Long) {
        var i = i0
        if (seg[i] == v) return
        seg[i] = v
        while (i != 0) {
            i = (i - 1) / 2
            seg[i] = minOf(seg[2 * i + 1], seg[2 * i + 2])
        }
    }
}
