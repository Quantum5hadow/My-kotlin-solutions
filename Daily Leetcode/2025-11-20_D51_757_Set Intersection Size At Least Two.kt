/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/set-intersection-size-at-least-two/solutions/7580356/757-set-intersection-size-at-least-two-e-fe3s

Day         : 51
Date        : 2025-11-20
*/


class Solution {
    fun intersectionSizeTwo(intervals: Array<IntArray>): Int {
        intervals.sortWith { a, b ->
            if (a[1] == b[1]) {
                b[0] - a[0]
            } else {
                a[1] - b[1]
            }
        }
        val list: MutableList<Int> = ArrayList()
        list.add(intervals[0][1] - 1)
        list.add(intervals[0][1])
        for (i in 1 until intervals.size) {
            val lastOne = list[list.size - 1]
            val lastTwo = list[list.size - 2]
            val interval = intervals[i]
            val start = interval[0]
            val end = interval[1]
            if (lastOne >= start && lastTwo >= start) {
                continue
            } else if (lastOne >= start) {
                list.add(end)
            } else {
                list.add(end - 1)
                list.add(end)
            }
        }
        return list.size
    }
}