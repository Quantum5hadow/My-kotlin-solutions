/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/smallest-number-with-all-set-bits/solutions/7577123/smallest-number-with-all-set-bits-by-pix-hx3y/
Problem     : 3370 Smallest Number With All Set Bits


Day         : 29
Date        : 2025-10-29
*/

class Solution {
    fun minNumberOperations(target: IntArray): Int {
        var operations = target[0]
        for (i in 1 until target.size) {
            if (target[i] > target[i - 1]) {
                operations += target[i] - target[i - 1]
            }
        }
        return operations
    }
}