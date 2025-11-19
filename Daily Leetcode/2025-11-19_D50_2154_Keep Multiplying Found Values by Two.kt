/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/keep-multiplying-found-values-by-two/solutions/7580346/2154-keep-multiplying-found-values-by-tw-8hhh
Problem     :  2154. Keep Multiplying Found Values by Two

Day         : 50
Date        : 2025-11-19
*/


class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        var original = original
        var i = 0
        while (i < nums.size) {
            if (nums[i] == original) {
                original = original * 2
                i = -1
            }
            i++
        }
        return original
    }
}