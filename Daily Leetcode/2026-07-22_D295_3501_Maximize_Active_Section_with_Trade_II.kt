/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximize-active-section-with-trade-ii/solutions/8412827/kotlin-easy-by-pixelprince-xrp1
Problem      : 3501. Maximize Active Section with Trade II
Day          : 295
Date         : 2026-07-22
*/

class SparseTable(a: IntArray) {
    private val st = ArrayList<IntArray>()

    init {
        st += a
        var k = 1
        while (k * 2 <= a.size + 1) {
            val p = st.last()
            val c = IntArray(a.size - k * 2 + 1)
            for (i in c.indices) c[i] = maxOf(p[i], p[i + k])
            st += c
            k = k shl 1
        }
    }

    fun query(l: Int, r: Int): Int {
        if (l > r) return 0
        val k = 31 - Integer.numberOfLeadingZeros(r - l + 1)
        return maxOf(st[k][l], st[k][r - (1 shl k) + 1])
    }
}

class Solution {
    fun maxActiveSectionsAfterTrade(s: String, queries: Array<IntArray>): List<Int> {
        var ones = 0
        val len = ArrayList<Int>()
        val L = ArrayList<Int>()
        val R = ArrayList<Int>()

        var i = 0
        while (i < s.length) {
            val j = i
            while (i < s.length && s[i] == s[j]) i++
            if (s[j] == '1') ones += i - j
            else {
                len += i - j
                L += j
                R += i - 1
            }
        }

        if (len.size < 2) return List(queries.size) { ones }

        val pair = IntArray(len.size - 1)
        for (i in pair.indices) pair[i] = len[i] + len[i + 1]
        val rmq = SparseTable(pair)

        fun lb(x: Int): Int {
            var l = 0
            var r = R.size
            while (l < r) {
                val m = (l + r) / 2
                if (R[m] < x) l = m + 1
                else r = m
            }
            return l
        }

        fun ub(x: Int): Int {
            var l = 0
            var r = L.size
            while (l < r) {
                val m = (l + r) / 2
                if (L[m] <= x) l = m + 1
                else r = m
            }
            return l
        }

        return List(queries.size) {
            val (ql, qr) = queries[it]
            val a = lb(ql)
            val b = ub(qr) - 1
            if (a >= b || a == len.size || b < 0) return@List ones

            val left = R[a] - maxOf(L[a], ql) + 1
            val right = minOf(R[b], qr) - L[b] + 1

            var best = if (a + 1 == b) left + right else maxOf(
                left + len[a + 1],
                right + len[b - 1]
            )

            if (a + 1 <= b - 2)
                best = maxOf(best, rmq.query(a + 1, b - 2))

            ones + best
        }
    }
}