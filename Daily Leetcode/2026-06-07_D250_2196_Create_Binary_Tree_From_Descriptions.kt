/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/create-binary-tree-from-descriptions/solutions/8319602/kotlin-easy-by-pixelprince-xf94
Problem      : 2196. Create Binary Tree From Descriptions
Day          : 250
Date         : 2026-06-07
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
class Solution{
    fun createBinaryTree(d:Array<IntArray>):TreeNode?{
        val m=HashMap<Int,TreeNode>();val c=HashSet<Int>()
        for((p,v,l) in d){
            val a=m.getOrPut(p){TreeNode(p)}
            val b=m.getOrPut(v){TreeNode(v)}
            if(l==1)a.left=b else a.right=b
            c.add(v)
        }
        return m.values.first{it.`val` !in c}
    }
}