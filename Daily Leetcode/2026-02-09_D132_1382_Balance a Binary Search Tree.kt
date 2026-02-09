
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/balance-a-binary-search-tree/solutions/7583473/balance-a-binary-search-tree-easy-by-pix-hlnw
Problem      : 1382. Balance a Binary Search Tree
Day          : 132
Date         : 2026-02-09
*/

class Solution {
    fun balanceBST(r: TreeNode?): TreeNode? {
        val a = mutableListOf<Int>()
        fun f(n: TreeNode?) { if (n != null) 
        { f(n.left); a += n.`val`; f(n.right) } }
        fun g(l: Int, r: Int): TreeNode? =
            if (l > r) null else TreeNode(a[(l + r) ushr 1]).also {
                it.left = g(l, ((l + r) ushr 1) - 1)
                it.right = g(((l + r) ushr 1) + 1, r)
            }
        f(r)
        return g(0, a.lastIndex)
    }
}