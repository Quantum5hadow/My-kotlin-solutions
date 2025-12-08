
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-square-sum-triples/solutions/7581566/1925-count-square-sum-triples-easy-by-pi-4v6b
Problem     : 1925. Count Square Sum Triples

Day         : 69
Date        : 2025-12-08
*/

class Solution {
    fun countTriples(n: Int): Int {
        var count = 0
        for (i in 1 until n) {
            for (j in 1 until n) {
                val product = i * i + j * j
                val sq = Math.sqrt(product.toDouble())
                if (sq <= n && sq - Math.floor(sq) == 0.0) {
                    count++
                }
            }
        }
        return count
    }
}