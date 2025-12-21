/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/delete-columns-to-make-sorted-ii/solutions/7581742/delete-columns-to-make-sorted-ii-easy-by-zshv
Problem     : 955. Delete Columns to Make Sorted II
Day         : 82
Date        : 2025-12-21



*/

class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        val sorted = BooleanArray(strs.size)
        var res = 0
        for (i in 0 until strs[0].length) {
            var j = 0
            while (j < strs.size - 1) {
                if (!sorted[j] && strs[j][i] > strs[j + 1][i]) {
                    res++
                    break
                }
                j++
            }
            if (j < strs.size - 1) {
                continue
            }
            j = 0
            while (j < strs.size - 1) {
                if (strs[j][i] < strs[j + 1][i]) {
                    sorted[j] = true
                }
                j++
            }
        }
        return res
    }
}