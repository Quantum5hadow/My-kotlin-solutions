/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/solutions/7604904/easy-by-pixelprince-dunl
Problem      : 1022. Sum of Root To Leaf Binary Numbers
Day          : 147
Date         : 2026-02-24
*/

class Solution {
    fun sumRootToLeaf(r: TreeNode?, s: Int = 0): Int = r?.run {
        val v = s shl 1 or `val`
        if (left == right) v else sumRootToLeaf(left, v) + sumRootToLeaf(right, v)
    } ?: 0
}
