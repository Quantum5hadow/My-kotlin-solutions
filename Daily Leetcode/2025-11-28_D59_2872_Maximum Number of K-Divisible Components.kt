/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-number-of-k-divisible-components/solutions/7581475/2872-maximum-number-of-k-divisible-compo-nor2
Problem     : 2872. Maximum Number of K-Divisible Components

Day         : 59
Date        : 2025-11-28
*/


class Solution {
    private var ans = 0

    fun maxKDivisibleComponents(n: Int, edges: Array<IntArray>, values: IntArray, k: Int): Int {
        val adj: MutableList<MutableList<Int>> = ArrayList()
        for (i in 0 until n) {
            adj.add(ArrayList())
        }
        for (edge in edges) {
            val start = edge[0]
            val end = edge[1]
            adj[start].add(end)
            adj[end].add(start)
        }
        val isVis = BooleanArray(n)
        isVis[0] = true
        get(0, -1, adj, isVis, values, k.toLong())
        return ans
    }

    private fun get(
        curNode: Int,
        parent: Int,
        adj: List<MutableList<Int>>,
        isVis: BooleanArray,
        values: IntArray,
        k: Long,
    ): Long {
        var sum = values[curNode].toLong()
        for (ele in adj[curNode]) {
            if (ele != parent && !isVis[ele]) {
                isVis[ele] = true
                sum += get(ele, curNode, adj, isVis, values, k)
            }
        }
        return if (sum % k == 0L) {
            ans++
            0
        } else {
            sum
        }
    }
}
