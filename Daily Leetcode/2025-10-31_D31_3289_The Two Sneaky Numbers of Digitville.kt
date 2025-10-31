/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/solutions/7577085/the-two-sneaky-numbers-of-digitville-by-2xnpx/

Problem     : 3289. The Two Sneaky Numbers of Digitville


Day         : 31
Date        : 2025-10-31
*/

import java.util.HashMap

class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val countMap: MutableMap<Int, Int> = HashMap<Int, Int>()
    
        for (num in nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1)
        }
        
        val result = IntArray(2)
        var index = 0
    
        for (entry in countMap.entries) {
            if (entry.value == 2) {
                result[index++] = entry.key
                
                if (index == 2) {
                    break
                }
            }
        }
        return result
    }
}