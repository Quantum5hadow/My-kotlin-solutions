/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence/solutions/8448432/kotlin-easy-by-pixelprince-7hkn
Problem      : 3302. Find the Lexicographically Smallest Valid Sequence
Day          : 312
Date         : 2026-08-08
*/

class Solution {
    fun validSequence(a: String, b: String): List<Int> {
        val n = b.length
        val l = IntArray(n) { -1 }
        var j = n - 1
        for (i in a.indices.reversed()) if (j >= 0 && a[i] == b[j]) l[j--] = i
        val r = mutableListOf<Int>()
        var k = 0
        j = 0
        for (i in a.indices) {
            if (j == n) break
            if (a[i] == b[j] || k == 0 && (j == n - 1 || i < l[j + 1])) {
                k += (a[i] != b[j]).compareTo(false)
                r += i
                j++
            }
        }
        return if (j == n) r else emptyList()
    }
}