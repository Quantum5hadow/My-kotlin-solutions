
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximal-rectangle/solutions/7582079/easy-by-pixelprince-5tba
Problem      : 85. Maximal Rectangle
Day          : 103
Date         : 2026-01-11
*/

class Solution {
    fun maximalRectangle(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return 0
        val n = matrix[0].size
        val h = IntArray(n)
        var ans = 0

        for (row in matrix) {
            for (i in 0 until n) {
                h[i] = if (row[i] == '1') h[i] + 1 else 0
            }
            ans = maxOf(ans, largestRectangleArea(h))
        }
        return ans
    }

    private fun largestRectangleArea(h: IntArray): Int {
        val st = ArrayDeque<Int>()
        var res = 0
        val a = h + intArrayOf(0)

        for (i in a.indices) {
            while (st.isNotEmpty() && a[st.last()] > a[i]) {
                val height = a[st.removeLast()]
                val width = if (st.isEmpty()) i else i - st.last() - 1
                res = maxOf(res, height * width)
            }
            st.addLast(i)
        }
        return res
    }
}

