/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-time-to-make-rope-colorful/solutions/7578622/easy-by-pixelprince-2gcd

Problem     : 1578. Minimum Time to Make Rope Colorful




Day         : 34
Date        : 2025-11-3
*/

class Solution {
    fun minCost(colors: String, neededTime: IntArray): Int {
        val str = colors.toCharArray()
        var minCost = 0
        for (i in 1 until str.size) {
            if (str[i] == str[i - 1]) {
                
                minCost += Math.min(neededTime[i], neededTime[i - 1])
                
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1])
            }
        }
        return minCost
    }
}