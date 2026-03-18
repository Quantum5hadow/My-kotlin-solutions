/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/solutions/7657623/easy-kotlin-by-pixelprince-chj5
Problem      : 3070. Count Submatrices with Top-Left Element and Sum Less Than k
Day          : 169
Date         : 2026-03-18
*/

class Solution {
    fun countSubmatrices(g: Array<IntArray>, k: Int): Int {
        val r = g.size; val c = g[0].size
        val p = Array(r+1){IntArray(c+1)}
        var ans = 0
        for(i in 1..r) for(j in 1..c){
            p[i][j] = g[i-1][j-1] + p[i-1][j] + p[i][j-1] - p[i-1][j-1]
            if(p[i][j] <= k) ans++
        }
        return ans
    }
}