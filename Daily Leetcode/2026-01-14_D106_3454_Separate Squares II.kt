/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/separate-squares-ii/solutions/7583303/separate-squares-ii-easy-by-pixelprince-apc4
Problem      : 3454. Separate Squares II
Day          : 106
Date         : 2026-01-14
*/

class Solution {
    fun separateSquares(squares: Array<IntArray>): Double {
        val n = squares.size
        val m = 2 * n
        val events = createEvents(squares, m)
        val xsRaw = createXsRaw(squares, m)
        events.sortWith { a, b -> a.y.compareTo(b.y) }
        val xs = compress(xsRaw)
        val totalUnionArea = calculateTotalUnionArea(events, xs, m)
        val target = totalUnionArea / 2.0
        return findSplitPoint(events, xs, m, target)
    }

    private fun createEvents(squares: Array<IntArray>, m: Int): Array<Event> {
        val events = Array(m) { Event(0.0, 0.0, 0.0, 0) }
        var idx = 0
        for (sq in squares) {
            val x = sq[0].toDouble()
            val y = sq[1].toDouble()
            val l = sq[2].toDouble()
            events[idx++] = Event(y, x, x + l, 1)
            events[idx++] = Event(y + l, x, x + l, -1)
        }
        return events
    }

    private fun createXsRaw(squares: Array<IntArray>, m: Int): DoubleArray {
        val xsRaw = DoubleArray(m)
        var i = 0
        for (sq in squares) {
            val x = sq[0].toDouble()
            val l = sq[2].toDouble()
            xsRaw[i++] = x
            xsRaw[i++] = x + l
        }
        return xsRaw
    }

    private fun calculateTotalUnionArea(
        events: Array<Event>,
        xs: DoubleArray,
        m: Int
    ): Double {
        val segTree = SegmentTree(xs)
        var area = 0.0
        var lastY = events[0].y
        var i = 0

        while (i < m) {
            val curY = events[i].y
            if (curY > lastY) {
                area += segTree.query() * (curY - lastY)
                lastY = curY
            }
            while (i < m && events[i].y == curY) {
                val (l, r) = findIndices(xs, events[i])
                segTree.update(1, 0, xs.size - 1, l, r, events[i].type)
                i++
            }
        }
        return area
    }

    private fun findSplitPoint(
        events: Array<Event>,
        xs: DoubleArray,
        m: Int,
        target: Double
    ): Double {
        val segTree = SegmentTree(xs)
        var lastY = events[0].y
        var area = 0.0
        var i = 0

        while (i < m) {
            val curY = events[i].y
            if (curY > lastY) {
                val unionX = segTree.query()
                val dy = curY - lastY
                if (area + unionX * dy >= target - 1e-10) {
                    return lastY + (target - area) / unionX
                }
                area += unionX * dy
                lastY = curY
            }
            while (i < m && events[i].y == curY) {
                val (l, r) = findIndices(xs, events[i])
                segTree.update(1, 0, xs.size - 1, l, r, events[i].type)
                i++
            }
        }
        return lastY
    }

    private fun findIndices(xs: DoubleArray, e: Event): IntArray {
        var l = xs.binarySearch(e.x1)
        if (l < 0) l = -l - 1
        var r = xs.binarySearch(e.x2)
        if (r < 0) r = -r - 1
        return intArrayOf(l, r)
    }

    private fun compress(arr: DoubleArray): DoubleArray {
        arr.sort()
        val res = DoubleArray(arr.distinct().size)
        res[0] = arr[0]
        var j = 1
        for (i in 1 until arr.size) {
            if (arr[i] != arr[i - 1]) {
                res[j++] = arr[i]
            }
        }
        return res
    }

    private class Event(
        val y: Double,
        val x1: Double,
        val x2: Double,
        val type: Int
    )

    private class SegmentTree(private val xs: DoubleArray) {
        private val tree = DoubleArray(4 * xs.size)
        private val count = IntArray(4 * xs.size)

        fun update(idx: Int, l: Int, r: Int, ql: Int, qr: Int, v: Int) {
            if (qr <= l || ql >= r) return
            if (ql <= l && r <= qr) {
                count[idx] += v
            } else {
                val mid = (l + r) shr 1
                update(idx shl 1, l, mid, ql, qr, v)
                update(idx shl 1 or 1, mid, r, ql, qr, v)
            }
            tree[idx] = when {
                count[idx] > 0 -> xs[r] - xs[l]
                r - l == 1 -> 0.0
                else -> tree[idx shl 1] + tree[idx shl 1 or 1]
            }
        }

        fun query(): Double = tree[1]
    }
}
