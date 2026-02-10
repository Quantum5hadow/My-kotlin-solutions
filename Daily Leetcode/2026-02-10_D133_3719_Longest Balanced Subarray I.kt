/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-balanced-subarray-i/solutions/7583478/longest-balanced-subarray-i-easy-by-pixe-h3tr
Problem      : 3719. Longest Balanced Subarray I
Day          : 133
Date         : 2026-02-10
*/

class Solution {
    fun longestBalanced(a: IntArray): Int {
        var ans = 0
        for (i in a.indices) {
            val e = HashSet<Int>(); val o = HashSet<Int>()
            for (j in i until a.size) {
                if (a[j] and 1 == 0) e.add(a[j]) else o.add(a[j])
                if (e.size == o.size) ans = maxOf(ans, j - i + 1)
            }
        }
        return ans
    }
}
