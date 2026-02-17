/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/binary-watch/solutions/7585784/easy-by-pixelprince-q3oo
Problem      : 401. Binary Watch
Day          : 140
Date         : 2026-02-17
*/

class Solution {
    fun readBinaryWatch(k: Int) =
        (0 until 720).mapNotNull {
            val h = it / 60
            val m = it % 60
            if (Integer.bitCount(h) + Integer.bitCount(m) == k)
                "%d:%02d".format(h, m)
            else null
        }
}