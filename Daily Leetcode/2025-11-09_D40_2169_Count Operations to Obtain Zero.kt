/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-operations-to-obtain-zero/solutions/7578686/easy-by-pixelprince-mu4z
Problem     : 2169. Count Operations to Obtain Zero



Day         : 40
Date        : 2025-11-9
*/


class Solution {
    fun countOperations(num1: Int, num2: Int): Int {
        var num1 = num1
        var num2 = num2
        var ans = 0
        while (num1 * num2 != 0) {
            if (num1 >= num2) {
                ans += num1 / num2
                num1 = num1 % num2
            } else {
                ans += num2 / num1
                num2 = num2 % num1
            }
        }
        return ans
    }
}