/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/calculate-money-in-leetcode-bank/solutions/7578442/calculate-money-in-leetcode-bank-easy-by-rusc

Problem     : 1716. Calculate Money in Leetcode Bank



Day         : 25
Date        : 2025-10-25
*/


class Solution {
    fun totalMoney(n: Int): Int {
        var n = n
        var mondayMoney = 1
        var total = 0
        while (n > 0) {
            var weekDays = 0
            var base = mondayMoney
            while (weekDays < 7 && n > 0) {
                total += base
                base++
                weekDays++
                n--
            }
            mondayMoney++
        }
        return total
    }
}