/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/solutions/7583427/divide-an-array-into-subarrays-with-mini-6hz4
Problem      : 3010. Divide an Array Into Subarrays With Minimum Cost I
Day          : 124
Date         : 2026-02-01
*/

class Solution {
    fun minimumCost(a: IntArray): Int {
        var m1 = 51
        var m2 = 52
        for (i in 1 until a.size) {
            val v = a[i]
            if (v < m1) { m2 = m1; m1 = v }
            else if (v < m2) m2 = v
        }
        return a[0] + m1 + m2
    }
}

