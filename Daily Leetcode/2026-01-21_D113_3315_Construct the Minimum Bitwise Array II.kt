
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/solutions/7583354/construct-the-minimum-bitwise-array-ii-e-8av0
Problem      : 3315. Construct the Minimum Bitwise Array II
Day          : 113
Date         : 2026-01-21
*/

class Solution {
    fun minBitwiseArray(nums: List<Int>): IntArray {
        val res = IntArray(nums.size)

        for (i in nums.indices) {
            val num = nums[i]
            res[i] = -1

            var p = 0
            while (p < 31 && ((num shr p) and 1) == 1) {
                p++
            }

            if (p > 0) {
                res[i] = ((num shr p) shl p) or ((1 shl (p - 1)) - 1)
            }
        }
        return res
    }
}