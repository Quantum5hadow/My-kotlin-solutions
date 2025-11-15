/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-the-number-of-substrings-with-dominant-ones/solutions/7579655/3234-count-the-number-of-substrings-with-hmvs
Problem     : 3234. Count the Number of Substrings With Dominant Ones



Day         : 46
Date        : 2025-11-15
*/


cclass Solution {
    fun numberOfSubstrings(s: String): Int {
        val zero: MutableList<Int> = ArrayList()
        zero.add(-1)
        var result = 0
        for (i in s.indices) {
            if (s[i] == '0') {
                zero.add(i)
            } else {
                result += i - zero[zero.size - 1]
            }
            for (j in 1 until zero.size) {
                val len = j * (j + 1)
                if (len > i + 1) {
                    break
                }
                val prev = zero[zero.size - j - 1]
                val from = min((i - len + 1), zero[zero.size - j])
                if (from > prev) {
                    result += from - prev
                }
            }
        }
        return result
    }
}