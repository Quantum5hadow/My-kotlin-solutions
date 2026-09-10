/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/solutions/8513384/kotlin-easy-by-pixelprince-yi5k
Problem      : 2265. Count Nodes Equal to Average of Subtree
Day          : 345
Date         : 2026-09-10
*/

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var ans = 0

    fun averageOfSubtree(root: TreeNode?): Int {
        fun dfs(n: TreeNode?): Pair<Int,Int> {
            if (n == null) return 0 to 0
            val (s1,c1)=dfs(n.left)
            val (s2,c2)=dfs(n.right)
            val s=s1+s2+n.`val`
            val c=c1+c2+1
            if(s/c==n.`val`)ans++
            return s to c
        }
        dfs(root)
        return ans
    }
}