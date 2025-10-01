// LeetCode ID: PixelPrince
// Profile: https://leetcode.com/u/PixelPrince/
// Problem: 1518. Water Bottles
// Day: 1
// Date: 2025-10-01
// Time: O(log n)
// Space: O(1)
class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var drunk = numBottles
        var emptyBottles = numBottles
        while (emptyBottles >= numExchange) {
            val exchangedBottles = emptyBottles / numExchange
            drunk += exchangedBottles
            val unUsedEmptyBottles = emptyBottles % numExchange
            emptyBottles = exchangedBottles + unUsedEmptyBottles
        }
        return drunk
    }
}