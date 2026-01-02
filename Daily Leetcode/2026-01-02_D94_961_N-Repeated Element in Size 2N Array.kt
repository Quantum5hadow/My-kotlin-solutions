/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/n-repeated-element-in-size-2n-array/solutions/7581843/n-repeated-element-in-size-2n-array-easy-da7z
Problem     : 961. N-Repeated Element in Size 2N Array
Day         : 94
Date        : 2026-01-02
*/

class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        val seen = HashSet<Int>()
        for (x in nums) {
            if (!seen.add(x)) return x
        }
        return -1
    }
}
