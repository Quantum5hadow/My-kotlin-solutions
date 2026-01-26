
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-absolute-difference/solutions/7583392/minimum-absolute-difference-easy-by-pixe-qb2e
Problem      : 1200. Minimum Absolute Difference
Day          : 118
Date         : 2026-01-26
*/

class Solution {
    fun minimumAbsDifference(a: IntArray): List<List<Int>> {
        a.sort()
        var best = Int.MAX_VALUE
        val res = ArrayList<List<Int>>()
        for (i in 0 until a.size - 1) {
            val d = a[i + 1] - a[i]
            if (d < best) {
                best = d
                res.clear()
            }
            if (d == best) {
                res.add(listOf(a[i], a[i + 1]))
            }
        }
        return res
    }
}