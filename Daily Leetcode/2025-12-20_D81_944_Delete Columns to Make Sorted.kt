/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/delete-columns-to-make-sorted/solutions/7581730/delete-columns-to-make-sorted-easy-by-pi-c8wa
Problem     : 944. Delete Columns to Make Sorted
Day         : 81
Date        : 2025-12-20



*/
class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        var deleted = 0
        for (i in 0 until strs[0].length) {
            var last = ' '
            for (str in strs) {
                if (str[i] < last) {
                    deleted++
                    break
                }
                last = str[i]
            }
        }
        return deleted
    }
}