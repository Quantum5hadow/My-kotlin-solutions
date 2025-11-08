/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/solutions/7578665/easy-by-pixelprince-wm6e
Problem     : 1611. Minimum One Bit Operations to Make Integers Zero



Day         : 39
Date        : 2025-11-8
*/


class Solution {
    fun minimumOneBitOperations(n: Int): Int {
        return calc(calculateOneIndex(n))
    }

    private fun calc(indices: LinkedList<Int>): Int {
        if (indices.isEmpty()) {
            return 0
        }
        val index = indices.removeLast()
        return stepOfExp(index) - calc(indices)
    }

    private fun calculateOneIndex(n: Int): LinkedList<Int> {
        var n = n
        val result = LinkedList<Int>()
        var index = 1
        while (n > 0) {
            if (n % 2 == 1) {
                result.add(index)
            }
            n = n shr 1
            index++
        }
        return result
    }

    private fun stepOfExp(index: Int): Int {
        var index = index
        var result = 1
        while (index > 0) {
            result = result shl 1
            index--
        }
        return result - 1
    }
}