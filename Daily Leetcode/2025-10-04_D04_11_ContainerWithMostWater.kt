/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/container-with-most-water/solutions/7574695/container-with-most-water-telugu-by-pixe-31go/

Problem     : 11. Container With Most Water
Day         : 04
Date        : 2025-10-04
*/

class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        if (height.isNotEmpty()) {
            var left = 0
            var right = height.size - 1
            while (left < right) {
                
                if (height[left] == 0) {
                    left++
                    continue
                }
                if (height[right] == 0) {
                    right--
                    continue
                }
                
                if (height[left] < height[right]) {
                    max = Math.max(max, (right - left) * height[left])
                    left++
                } else {
                    max = Math.max(max, (right - left) * height[right])
                    right--
                }
            }
        }
        return max
    }
}