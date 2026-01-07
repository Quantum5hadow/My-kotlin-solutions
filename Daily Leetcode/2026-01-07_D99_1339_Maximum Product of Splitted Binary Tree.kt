/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/solutions/7581881/maximum-product-of-splitted-binary-tree-bi5kc
Problem     : 1339. Maximum Product of Splitted Binary Tree
Day         : 99
Date        : 2026-01-07
*/

class Solution {
    private val mod = 1_000_000_007L
    private var total = 0L
    private var best = 0L

    fun maxProduct(root: TreeNode?): Int {
        total = dfsSum(root)
        dfs(root)
        return (best % mod).toInt()
    }

    private fun dfsSum(node: TreeNode?): Long {
        if (node == null) return 0
        return node.`val`.toLong() + dfsSum(node.left) + dfsSum(node.right)
    }

    private fun dfs(node: TreeNode?): Long {
        if (node == null) return 0
        val left = dfs(node.left)
        val right = dfs(node.right)
        val cur = node.`val`.toLong() + left + right
        best = maxOf(best, cur * (total - cur))
        return cur
    }
}