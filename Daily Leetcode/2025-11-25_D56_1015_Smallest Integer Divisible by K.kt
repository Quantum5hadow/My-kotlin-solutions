/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/smallest-integer-divisible-by-k/solutions/7581361/1015-smallest-integer-divisible-by-k-eas-5ndx
Problem     : 1015. Smallest Integer Divisible by K

Day         : 56
Date        : 2025-11-25
*/


class Solution {
    fun smallestRepunitDivByK(k: Int): Int {
        if (k % 2 == 0 || k % 5 == 0) return -1
        var r = 0
        for (i in 1..k) {
            r = (r * 10 + 1) % k
            if (r == 0) return i
        }
        return -1
    }
}