
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/solutions/7581555/1523-count-odd-numbers-in-an-interval-ra-rts2
Problem     : 1523. Count Odd Numbers in an Interval Range

Day         : 68
Date        : 2025-12-07
*/

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        return if (low % 2 != 0 || high % 2 != 0) {
            (high - low) / 2 + 1
        } else {
            (high - low) / 2
        }
    }
}