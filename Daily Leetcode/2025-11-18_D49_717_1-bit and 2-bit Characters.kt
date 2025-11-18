/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/1-bit-and-2-bit-characters/solutions/7580340/717-1-bit-and-2-bit-characters-easy-by-p-slx1
Problem     : 717. 1-bit and 2-bit Characters

Day         : 49
Date        : 2025-11-18
*/


class Solution {
    fun isOneBitCharacter(arr: IntArray): Boolean {
        var i = 0
        while (i < arr.size - 1) {
            i = if (arr[i] == 1) i + 2 else i + 1
        }
        return i == arr.size - 1
    }
}