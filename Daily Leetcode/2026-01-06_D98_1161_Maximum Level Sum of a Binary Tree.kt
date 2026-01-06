/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/solutions/7581878/maximum-level-sum-of-a-binary-tree-easy-u6u8a
Problem     : 1161. Maximum Level Sum of a Binary Tree
Day         : 98
Date        : 2026-01-06
*/
 
class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0
        val q: ArrayDeque<TreeNode> = ArrayDeque()
        q.add(root)

        var level = 1
        var ans = 1
        var maxSum = Int.MIN_VALUE

        while (q.isNotEmpty()) {
            var sz = q.size
            var sum = 0
            repeat(sz) {
                val cur = q.removeFirst()
                sum += cur.`val`
                cur.left?.let { q.add(it) }
                cur.right?.let { q.add(it) }
            }
            if (sum > maxSum) {
                maxSum = sum
                ans = level
            }
            level++
        }
        return ans
    }
}