/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/number-of-substrings-with-only-1s/solutions/7580323/1513-number-of-substrings-with-only-1s-e-a0nu
Problem     : 1513. Number of Substrings With Only 1s


Day         : 47
Date        : 2025-11-16
*/


class Solution {
    fun numSub(s: String): Int {
        var count: Long = 0
        var res: Long = 0
        for (ch in s.toCharArray()) {
            if (ch == '0') {
                res += count * (count + 1) / 2
                count = 0
            } else {
                count++
            }
        }
        res += count * (count + 1) / 2
        return (res % 1000000007).toInt()
    }
}