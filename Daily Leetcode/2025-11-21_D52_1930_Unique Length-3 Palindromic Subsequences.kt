/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/unique-length-3-palindromic-subsequences/solutions/7580363/1930-unique-length-3-palindromic-subsequ-hrx1
Problem     : 1930. Unique Length-3 Palindromic Subsequences

Day         : 52
Date        : 2025-11-21
*/


class Solution {
    fun countPalindromicSubsequence(s: String): Int {
        val last = IntArray(26)
        last.fill(-1)
        for (i in s.length - 1 downTo 0) {
            if (last[s[i].code - 'a'.code] == -1) {
                last[s[i].code - 'a'.code] = i
            }
        }
        var ans = 0
        val count = IntArray(26)
        val first: MutableMap<Int, IntArray> = HashMap()
        for (i in 0 until s.length) {
            val cur = s[i].code - 'a'.code
            if (last[cur] - i <= 1 && !first.containsKey(cur)) {
                last[cur] = -1
            }
            if (last[cur] == i) {
                val oldCount = first[cur]
                for (j in 0..25) {
                    if (count[j] - oldCount!![j] > 0) {
                        ans++
                    }
                }
            }
            count[cur]++
            if (last[cur] > -1 && !first.containsKey(cur)) {
                first[cur] = count.clone()
            }
        }
        return ans
    }
}