/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/solutions/7578689/easy-by-pixelprince-h1yz
Problem     : 3542. Minimum Operations to Convert All Elements to Zero



Day         : 41
Date        : 2025-11-10
*/


class Solution {
    fun minOperations(nums: IntArray): Int {
        val mq = IntArray(nums.size)
        var idx = 0
        var res = 0
        for (num in nums) {
            if (num == 0) {
                res += idx
                idx = 0
            } else {
                while (idx > 0 && mq[idx - 1] >= num) {
                    if (mq[idx - 1] > num) {
                        res++
                    }
                    idx--
                }
                mq[idx++] = num
            }
        }
        return res + idx
    }
}