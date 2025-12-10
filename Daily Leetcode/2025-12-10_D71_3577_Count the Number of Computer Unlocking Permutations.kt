
/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/count-the-number-of-computer-unlocking-permutations/solutions/7581609/3577-count-the-number-of-computer-unlock-ufn5
Problem     : 3577. Count the Number of Computer Unlocking Permutations
Day         : 71
Date        : 2025-12-10
*/

class Solution {
    fun countPermutations(complexity: IntArray): Int {
        val n = complexity.size
        for (i in 1..<n) {
            if (complexity[i] <= complexity[0]) {
                return 0
            }
        }
        var ans: Long = 1
        for (x in 2..<n) {
            ans = (ans * x) % MOD
        }
        return ans.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}