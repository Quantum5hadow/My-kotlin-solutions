/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field/solutions/7583315/maximum-square-area-by-removing-fences-f-a72z
Problem      : 2975. Maximum Square Area by Removing Fences From a Field
Day          : 108
Date         : 2026-01-16
*/

class Solution {
    fun maximizeSquareArea(
        m: Int,
        n: Int,
        h: IntArray,
        v: IntArray
    ): Int {

        val hb = IntArray(h.size + 2)
        System.arraycopy(h, 0, hb, 0, h.size)
        hb[h.size] = 1
        hb[h.size + 1] = m
        hb.sort()

        val edges = HashSet<Int>()
        for (i in hb.indices) {
            for (j in i + 1 until hb.size) {
                edges.add(hb[j] - hb[i])
            }
        }

        val vb = IntArray(v.size + 2)
        System.arraycopy(v, 0, vb, 0, v.size)
        vb[v.size] = 1
        vb[v.size + 1] = n
        vb.sort()

        var best = -1
        for (i in vb.indices) {
            for (j in i + 1 until vb.size) {
                val d = vb[j] - vb[i]
                if (d in edges && d > best) {
                    best = d
                }
            }
        }

        if (best == -1) return -1
        return ((1L * best * best) % 1_000_000_007).toInt()
    }
}
