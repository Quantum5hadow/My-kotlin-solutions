/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximize-the-minimum-powered-city/solutions/7578656/easy-by-pixelprince-w8pk
Problem     : 2528. Maximize the Minimum Powered City




Day         : 38
Date        : 2025-11-7
*/


class Solution {
    private fun canIBeTheMinimum(power: LongArray, minimum: Long, k: Int, r: Int): Boolean {
        var k = k
        val n = power.size
        val extraPower = LongArray(n)
        for (i in 0 until n) {
            if (i > 0) {
                extraPower[i] += extraPower[i - 1]
            }
            val curPower = power[i] + extraPower[i]
            val req = minimum - curPower
            if (req <= 0) {
                continue
            }
            if (req > k) {
                return false
            }
            k -= req.toInt()
            extraPower[i] += req
            if (i + 2 * r + 1 < n) {
                extraPower[i + 2 * r + 1] -= req
            }
        }
        return true
    }

    private fun calculatePowerArray(stations: IntArray, r: Int): LongArray {
        val n = stations.size
        val preSum = LongArray(n)
        for (i in 0 until n) {
            var st = i - r
            val last = i + r + 1
            if (st < 0) {
                st = 0
            }
            preSum[st] += stations[i].toLong()
            if (last < n) {
                preSum[last] -= stations[i].toLong()
            }
        }
        for (i in 1 until n) {
            preSum[i] += preSum[i - 1]
        }
        return preSum
    }

    fun maxPower(stations: IntArray, r: Int, k: Int): Long {
        var min: Long = 0
        var sum = Math.pow(10.0, 10.0).toLong() + Math.pow(10.0, 9.0).toLong()
        val power = calculatePowerArray(stations, r)
        var ans: Long = -1
        while (min <= sum) {
            val mid = min + sum shr 1
            if (canIBeTheMinimum(power, mid, k, r)) {
                ans = mid
                min = mid + 1
            } else {
                sum = mid - 1
            }
        }
        return ans
    }
}