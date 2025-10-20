/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/solutions/7578557/final-value-of-variable-after-performing-jhva

Problem     : 2011. Final Value of Variable After Performing Operations


Day         : 20
Date        : 2025-10-20
*/

class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var xValue = 0
        for (word in operations) {
            if (word.contains("+")) {
                xValue++
            } else {
                xValue--
            }
        }
        return xValue
    }
}