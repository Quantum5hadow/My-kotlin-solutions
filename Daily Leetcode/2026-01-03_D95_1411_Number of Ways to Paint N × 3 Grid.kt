/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/solutions/7581848/number-of-ways-to-paint-n-x-3-grid-easy-k72nj
Problem     : 1411. Number of Ways to Paint N × 3 Grid
Day         : 95
Date        : 2026-01-03
*/

class Solution {
    fun numOfWays(n: Int): Int {
        val mod = 1_000_000_007L

        var aba = 6L
        var abc = 6L

        for (i in 2..n) {
            val newAba = (aba * 3 + abc * 2) % mod
            val newAbc = (aba * 2 + abc * 2) % mod
            aba = newAba
            abc = newAbc
        }

        return ((aba + abc) % mod).toInt()
    }
}