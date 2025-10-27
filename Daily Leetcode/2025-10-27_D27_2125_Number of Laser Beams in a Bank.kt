/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/number-of-laser-beams-in-a-bank/solutions/7577144/number-of-laser-beams-in-a-bank-by-pixel-tpmq

Problem     : 2125. Number of Laser Beams in a Bank



Day         : 27
Date        : 2025-10-27
*/


class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var beam = 0
        var prev = 0
        for (s in bank) {
            var nos = 0
            for (j in s.toCharArray()) {
                if (j == '1') {
                    nos++
                }
            }
            if (nos > 0) {
                if (prev == 0) {
                    prev = nos
                } else {
                    beam += prev * nos
                    prev = nos
                }
            }
        }
        return beam
    }
}