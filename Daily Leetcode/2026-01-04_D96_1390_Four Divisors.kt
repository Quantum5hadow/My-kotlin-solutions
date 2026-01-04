/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/four-divisors/solutions/7581858/four-divisors-easy-by-pixelprince-2fhx
Problem     : 1390. Four Divisors
Day         : 96
Date        : 2026-01-04
*/

class Solution {
    fun sumFourDivisors(nums: IntArray): Int {
        var ans = 0
        for (x in nums) {
            var cnt = 0
            var sum = 0
            var d = 1
            while (d * d <= x) {
                if (x % d == 0) {
                    val e = x / d
                    cnt++
                    sum += d
                    if (e != d) {
                        cnt++
                        sum += e
                    }
                    if (cnt > 4) break
                }
                d++
            }
            if (cnt == 4) ans += sum
        }
        return ans
    }
}