/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/apple-redistribution-into-boxes/solutions/7581772/apple-redistribution-into-boxes-easy-by-1650g
Problem     : 3074. Apple Redistribution into Boxes
Day         : 85
Date        : 2025-12-24
*/

class Solution {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        val count = IntArray(51)
        var appleSum = 0
        for (j in apple) {
            appleSum += j
        }
        var reqCapacity = 0
        var max = 0
        for (j in capacity) {
            count[j]++
            max = max(max, j)
        }
        for (i in max downTo 0) {
            if (count[i] >= 1) {
                while (count[i] != 0) {
                    appleSum -= i
                    reqCapacity++
                    if (appleSum <= 0) {
                        return reqCapacity
                    }
                    count[i]--
                }
            }
        }
        return reqCapacity
    }
}