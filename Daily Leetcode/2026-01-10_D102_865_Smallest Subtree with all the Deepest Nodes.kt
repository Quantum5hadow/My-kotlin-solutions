/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/solutions/7582042/easy-by-pixelprince-5wl9
Problem      : 865. Smallest Subtree with all the Deepest Nodes
Day          : 102
Date         : 2026-01-10
*/

class Solution {
    fun subtreeWithAllDeepest(root: TreeNode?): TreeNode? {
        return dfs(root).first
    }

    private fun dfs(node: TreeNode?): Pair<TreeNode?, Int> {
        if (node == null) return Pair(null, 0)

        val (lNode, lDepth) = dfs(node.left)
        val (rNode, rDepth) = dfs(node.right)

        return when {
            lDepth > rDepth -> Pair(lNode, lDepth + 1)
            rDepth > lDepth -> Pair(rNode, rDepth + 1)
            else -> Pair(node, lDepth + 1)
        }
    }
}
