/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/make-sum-divisible-by-p/solutions/7581487/1590-make-sum-divisible-by-p-easy-by-pix-xdry
Problem     : 1590. Make Sum Divisible by P

Day         : 61
Date        : 2025-11-30
*/


class Solution {
    fun minSubarray(nums: IntArray, p: Int): Int {
        val hmp = HashMap<Int, Int>()
        val n = nums.size
        var target = 0
        var sum = 0
        for (num in nums) {
            target = (num + target) % p
        }
        if (target == 0) {
            return 0
        }
        hmp[0] = -1
        var ans = n
        for (i in 0 until n) {
            sum = (sum + nums[i]) % p
            val key = (sum - target + p) % p
            if (hmp.containsKey(key)) {
                ans = Math.min(ans, i - hmp[key]!!)
            }
            hmp[sum % p] = i
        }
        return if (ans < n) {
            ans
        } else {
            -1
        }
    }
}