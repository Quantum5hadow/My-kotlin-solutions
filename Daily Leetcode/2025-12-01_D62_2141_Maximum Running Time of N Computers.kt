/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-running-time-of-n-computers/solutions/7581517/2141-maximum-running-time-of-n-computers-61c3
Problem     : 2141. Maximum Running Time of N Computers

Day         : 62
Date        : 2025-12-01
*/


class Solution {
    fun maxRunTime(n: Int, batteries: IntArray): Long {
        var sumbatt: Long = 0
        for (x in batteries) sumbatt += x.toLong()
        var l: Long = 0
        var r = sumbatt / n
        var res = Long.MIN_VALUE
        while (l <= r) {
            val mid = (l + r) / 2
            if (isPossible(mid, n, batteries)) {
                res = mid
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return res
    }

    private fun isPossible(mid: Long, n: Int, b: IntArray): Boolean {
        var sum: Long = 0
        for (x in b) sum += Math.min(x.toLong(), mid)
        return n * mid <= sum
    }
}