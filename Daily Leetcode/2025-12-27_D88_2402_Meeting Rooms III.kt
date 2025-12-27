/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/meeting-rooms-iii/solutions/7581790/meeting-rooms-iii-easy-by-pixelprince-8mw9
Problem     : 2402. Meeting Rooms III
Day         : 88
Date        : 2025-12-27
*/


class Solution {
    fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
        val counts = IntArray(n)
        val endTimes = LongArray(n)
        meetings.sortWith { a: IntArray, b: IntArray -> Integer.compare(a[0], b[0]) }
        for (meeting in meetings) {
            val id = findRoomId(endTimes, meeting[0])
            counts[id]++
            endTimes[id] = endTimes[id].coerceAtLeast(meeting[0].toLong()) + meeting[1] - meeting[0]
        }
        var res = 0
        var count: Long = 0
        for (i in 0 until n) {
            if (counts[i] > count) {
                count = counts[i].toLong()
                res = i
            }
        }
        return res
    }

    private fun findRoomId(endTimes: LongArray, start: Int): Int {
        val n = endTimes.size
        
        for (i in 0 until n) {
            if (endTimes[i] <= start) {
                return i
            }
        }
       
        var id = 0
        var min = Long.MAX_VALUE
        for (i in 0 until n) {
            if (endTimes[i] < min) {
                min = endTimes[i]
                id = i
            }
        }
        return id
    }
}