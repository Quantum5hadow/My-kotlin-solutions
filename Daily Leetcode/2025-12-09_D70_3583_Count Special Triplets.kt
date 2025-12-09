
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-special-triplets/solutions/7581595/3583-count-special-triplets-easy-by-pixe-wvis
Problem     : 3583. Count Special Triplets
Day         : 70
Date        : 2025-12-09
*/

class Solution {
    fun specialTriplets(nums: IntArray): Int {
        val mod = 1_000_000_007
        var res = 0
        val left = mutableMapOf<Int, Int>()
        val right = mutableMapOf<Int, Int>()
        for (num in nums) {
            right[num] = right.getOrDefault(num, 0) + 1
        }
        for (num in nums) {
            right[num] = right[num]!! - 1
            val ci = left.getOrDefault(num * 2, 0)
            val ck = right.getOrDefault(num * 2, 0)
            res = ((res + 1L * ci * ck) % mod).toInt()
            left[num] = left.getOrDefault(num, 0) + 1
        }
        return res
    }
}