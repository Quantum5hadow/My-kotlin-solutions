/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/balanced-binary-tree/solutions/7583463/balanced-binary-tree-easy-by-pixelprince-cw7n
Problem      : 110. Balanced Binary Tree
Day          : 131
Date         : 2026-02-08
*/


class Solution {
    fun isBalanced(r: TreeNode?) = h(r) != -1
    fun h(n: TreeNode?): Int {
        n ?: return 0
        val l = h(n.left); val r = h(n.right)
        return if (l < 0 || r < 0 || kotlin.math.abs(l - r) > 1) -1 else maxOf(l, r) + 1
    }
}