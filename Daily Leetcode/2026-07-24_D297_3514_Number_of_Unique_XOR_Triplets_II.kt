/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-unique-xor-triplets-ii/solutions/8416106/kotlin-easy-by-pixelprince-4dr3
Problem      : 3514. Number of Unique XOR Triplets II
Day          : 297
Date         : 2026-07-24
*/

class Solution {
    fun uniqueXorTriplets(nums: IntArray): Int {
        val p = hashSetOf<Int>()
        for (i in nums.indices)
            for (j in i until nums.size)
                p += nums[i] xor nums[j]
        val s = hashSetOf<Int>()
        for (x in p)
            for (y in nums)
                s += x xor y
        return s.size
    }
}