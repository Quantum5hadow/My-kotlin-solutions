/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/submissions/2102393186
Problem      : 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum
Day          : 315
Date         : 2026-08-11
*/

class Solution {
    fun missingInteger(a: IntArray): Int {
        var s = a[0]; var i = 1
        while (i < a.size && a[i] == a[i - 1] + 1) s += a[i++]
        return generateSequence(s) { it + 1 }.first { it !in a }
    }
}
