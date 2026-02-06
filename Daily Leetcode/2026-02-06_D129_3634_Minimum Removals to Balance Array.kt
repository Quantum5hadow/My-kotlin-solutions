/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-removals-to-balance-array/solutions/7583455/minimum-removals-to-balance-array-easy-b-96ws
Problem      : 3634. Minimum Removals to Balance Array
Day          : 129
Date         : 2026-02-06
*/

class Solution {
    fun minRemoval(a: IntArray, k: Int): Int {
        a.sort(); var w = 0; var c = 0
        for (x in a) if (1L * x > 1L * k * a[w]) { w++; c++ }
        return c
    }
}