/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/solutions/7579629/maximum-number-of-operations-to-move-one-ienr
Problem     : 3228. Maximum Number of Operations to Move Ones to the End.kt



Day         : 44
Date        : 2025-11-13
*/


class Solution {
    fun maxOperations(s: String): Int {
        val arr = s.toCharArray()
        var result = 0
        var ones = 0
        val n = arr.size
        for (i in 0 until n) {
            ones += arr[i].code - '0'.code
            if (i > 0 && arr[i] < arr[i - 1]) {
                result += ones
            }
        }
        return result
    }
}