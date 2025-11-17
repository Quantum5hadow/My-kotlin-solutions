/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  :https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/solutions/7580333/1437-check-if-all-1s-are-at-least-length-1cio
Problem     : 1437. Check If All 1's Are at Least Length K Places Away

Day         : 48
Date        : 2025-11-17
*/


class Solution {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var last = -k - 1
        for (i in nums.indices) {
            if (nums[i] == 1) {
                last = if (i - last - 1 >= k) {
                    i
                } else {
                    return false
                }
            }
        }
        return true
    }
}