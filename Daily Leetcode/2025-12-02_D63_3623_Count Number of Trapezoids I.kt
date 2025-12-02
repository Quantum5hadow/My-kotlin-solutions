/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-number-of-trapezoids-i/solutions/7581520/3623-count-number-of-trapezoids-i-easy-b-tst2
Problem     : 3623. Count Number of Trapezoids I

Day         : 63
Date        : 2025-12-02
*/


class Solution {
    fun countTrapezoids(points: Array<IntArray>): Int {
        val mod = 1000000007
        val inv = 500000004L
        val map: MutableMap<Int, Int> = HashMap<Int, Int>(points.size)
        for (p in points) {
            map.merge(p[1], 1) { a: Int, b: Int -> Integer.sum(a, b) }
        }
        var sum = 0L
        var sumPairs = 0L
        for (num in map.values) {
            if (num > 1) {
                val pairs = (num.toLong() * (num - 1) / 2) % mod
                sum = (sum + pairs) % mod
                sumPairs = (sumPairs + pairs * pairs % mod) % mod
            }
        }
        var res = (sum * sum % mod - sumPairs + mod) % mod
        res = (res * inv) % mod
        return res.toInt()
    }
}