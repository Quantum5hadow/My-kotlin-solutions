/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/two-best-non-overlapping-events/solutions/7581767/two-best-non-overlapping-events-easy-by-qzacs
Problem     : 2054. Two Best Non-Overlapping Events
Day         : 84
Date        : 2025-12-23
*/

class Solution {
    fun maxTwoEvents(events: Array<IntArray>): Int {
        events.sortWith { a: IntArray, b: IntArray -> a[0] - b[0] }
        val max = IntArray(events.size)
        for (i in events.indices.reversed()) {
            if (i == events.size - 1) {
                max[i] = events[i][2]
            } else {
                max[i] = events[i][2].coerceAtLeast(max[i + 1])
            }
        }
        var ans = 0
        for (i in events.indices) {
            val end = events[i][1]
            var left = i + 1
            var right = events.size
            while (left < right) {
                val mid = left + (right - left) / 2
                if (events[mid][0] <= end) {
                    left = mid + 1
                } else {
                    right = mid
                }
            }
            var value = events[i][2]
            if (right < events.size) {
                value += max[right]
            }
            ans = ans.coerceAtLeast(value)
        }
        return ans
    }
}