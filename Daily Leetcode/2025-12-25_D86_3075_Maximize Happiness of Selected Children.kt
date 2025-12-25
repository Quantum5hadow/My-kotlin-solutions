/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximize-happiness-of-selected-children/solutions/7581777/maximize-happiness-of-selected-children-h66ol
Problem     : 3075. Maximize Happiness of Selected Children
Day         : 86
Date        : 2025-12-25
*/

class Solution {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        happiness.sort()
        var sum: Long = 0
        for (i in happiness.size - 1 downTo happiness.size - k) {
            happiness[i] = max(0, happiness[i] - (happiness.size - 1 - i))
            sum += happiness[i].toLong()
        }
        return sum
    }
}

