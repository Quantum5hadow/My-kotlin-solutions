/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/solutions/7577118/minimum-number-of-increments-on-subarray-0q9r/
Problem     : 1526 Minimum Number of Increments on Subarrays to Form a Target Array

Day         : 30
Date        : 2025-10-30
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