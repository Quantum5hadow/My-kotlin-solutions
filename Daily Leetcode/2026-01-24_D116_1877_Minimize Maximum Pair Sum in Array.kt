/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/solutions/7583376/minimize-maximum-pair-sum-in-array-easy-yt2yj
Problem      : 1877. Minimize Maximum Pair Sum in Array
Day          : 116
Date         : 2026-01-24
*/

class Solution {
    fun minPairSum(nums: IntArray): Int {
        nums.sort()
        var l = 0
        var r = nums.lastIndex
        var ans = 0
        while (l < r) {
            ans = maxOf(ans, nums[l] + nums[r])
            l++; r--
        }
        return ans
    }
}
