/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-ii/solutions/7578542/maximum-frequency-of-an-element-after-pe-b3va

Problem     : 3347. Maximum Frequency of an Element After Performing Operations II

Day         : 22
Date        : 2025-10-22
*/






import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxFrequency(nums: IntArray, k: Int, numOperations: Int): Int {
        nums.sort()
        val n = nums.size
        var l = 0
        var r = 0
        var i = 0
        var j = 0
        var res = 0
        while (i < n) {
            while (j < n && nums[j] == nums[i]) {
                j++
            }
            while (l < i && nums[i] - nums[l] > k) {
                l++
            }
            while (r < n && nums[r] - nums[i] <= k) {
                r++
            }
            res = max(res, (min((i - l + r - j), numOperations) + j - i))
            i = j
        }
        i = 0
        j = 0
        while (i < n && j < n) {
            while (j < n && j - i < numOperations && nums[j] - nums[i] <= k * 2) {
                j++
            }
            res = max(res, (j - i))
            i++
        }
        return res
    }
}