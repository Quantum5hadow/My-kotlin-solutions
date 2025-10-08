/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/successful-pairs-of-spells-and-potions/solutions/7576832/successful-pairs-of-spells-and-potions-b-923n
Problem      : 2300. Successful Pairs of Spells and Potions
Day          : 8
Date         : 2025-10-08
*/

class Solution {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()
        for (i in spells.indices) {
            var l = 0
            var r = potions.size
            while (l < r) {
                val m = l + (r - l) / 2
                if (spells[i].toLong() * potions[m] >= success) {
                    r = m
                } else {
                    l = m + 1
                }
            }
            spells[i] = potions.size - l
        }
        return spells
    }
}