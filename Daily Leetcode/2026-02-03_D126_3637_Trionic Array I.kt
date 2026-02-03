
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/trionic-array-i/solutions/7583442/trionic-array-i-easy-by-pixelprince-wqwp
Problem      : 3637. Trionic Array I
Day          : 126
Date         : 2026-02-03
*/

class Solution {
    fun isTrionic(a: IntArray): Boolean {
        var i = 1
        val n = a.size
        while (i < n && a[i] > a[i-1]) i++
        if (i == 1 || i == n) return false
        while (i < n && a[i] < a[i-1]) i++
        if (i == n) return false
        while (i < n && a[i] > a[i-1]) i++
        return i == n
    }
}