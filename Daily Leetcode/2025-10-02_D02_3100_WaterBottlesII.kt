/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/water-bottles-ii/solutions/7574632/water-bottles-ii-by-pixelprince-i2va/

Problem     : 3100. Water Bottles II
Day         : 02
Date        : 2025-10-02

class Solution {
    fun maxBottlesDrunk(numBottles: Int, numExchange: Int): Int {
        var bottles = numBottles
        var exchange = numExchange
        var ans = numBottles

        while (bottles >= exchange) {
            bottles = (bottles - exchange + 1)
            exchange++
            ans++
        }

        return ans
    }
}
