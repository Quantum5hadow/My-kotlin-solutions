/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/champagne-tower/solutions/7578708/champagne-tower-very-easy-kotlin-by-pixe-2ku2
Problem      : 799. Champagne Tower
Day          : 137
Date         : 2026-02-14
*/

class Solution {
    fun champagneTower(p: Int, r: Int, g: Int): Double {
        var row = DoubleArray(r + 2); row[0] = p.toDouble()
        for (i in 0 until r) {
            val next = DoubleArray(r + 2)
            for (j in 0..i) {
                val o = maxOf(0.0, row[j] - 1) / 2
                next[j] += o; next[j + 1] += o
            }
            row = next
        }
        return minOf(1.0, row[g])
    }
}
