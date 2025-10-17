/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/maximize-the-number-of-partitions-after-operations/solutions/7578582/maximize-the-number-of-partitions-after-8pi9h

Problem     : 3003. Maximize the Number of Partitions After Operations



Day         : 18
Date        : 2025-10-18
*/

iimport kotlin.math.max

class Solution {
    fun maxPartitionsAfterOperations(s: String, k: Int): Int {
        if (k == ALPHABET_SIZE) {
            return 1
        }
        val n = s.length
        val ansr = IntArray(n)
        val usedr = IntArray(n)
        var used = 0
        var cntUsed = 0
        var ans = 1
        for (i in n - 1 downTo 0) {
            val ch = s[i].code - 'a'.code
            if ((used and (1 shl ch)) == 0) {
                if (cntUsed == k) {
                    cntUsed = 0
                    used = 0
                    ans++
                }
                used = used or (1 shl ch)
                cntUsed++
            }
            ansr[i] = ans
            usedr[i] = used
        }
        var ansl = 0
        ans = ansr[0]
        var l = 0
        while (l < n) {
            used = 0
            cntUsed = 0
            var usedBeforeLast = 0
            var usedTwiceBeforeLast = 0
            var last = -1
            var r = l
            while (r < n) {
                val ch = s[r].code - 'a'.code
                if ((used and (1 shl ch)) == 0) {
                    if (cntUsed == k) {
                        break
                    }
                    usedBeforeLast = used
                    last = r
                    used = used or (1 shl ch)
                    cntUsed++
                } else if (cntUsed < k) {
                    usedTwiceBeforeLast = usedTwiceBeforeLast or (1 shl ch)
                }
                r++
            }
            if (cntUsed == k) {
                if (last - l > Integer.bitCount(usedBeforeLast)) {
                    ans = max(ans, (ansl + 1 + ansr[last]))
                }
                if (last + 1 < r) {
                    if (last + 2 >= n) {
                        ans = max(ans, (ansl + 1 + 1))
                    } else {
                        if (Integer.bitCount(usedr[last + 2]) == k) {
                            val canUse = ((1 shl ALPHABET_SIZE) - 1) and used.inv() and usedr[last + 2].inv()
                            ans = if (canUse > 0) {
                                max(ans, (ansl + 1 + 1 + ansr[last + 2]))
                            } else {
                                max(ans, (ansl + 1 + ansr[last + 2]))
                            }
                            val l1 = s[last + 1].code - 'a'.code
                            if ((usedTwiceBeforeLast and (1 shl l1)) == 0) {
                                ans = max(ans, (ansl + 1 + ansr[last + 1]))
                            }
                        } else {
                            ans = max(ans, (ansl + 1 + ansr[last + 2]))
                        }
                    }
                }
            }
            l = r
            ansl++
        }
        return ans
    }

    companion object {
        private const val ALPHABET_SIZE = 'z'.code - 'a'.code + 1
    }
}