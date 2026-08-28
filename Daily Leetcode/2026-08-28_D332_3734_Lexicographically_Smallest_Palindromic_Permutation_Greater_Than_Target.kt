/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/lexicographically-smallest-palindromic-permutation-greater-than-target/solutions/8487271/kotlin-easy-by-pixelprince-blef
Problem      : 3734. Lexicographically Smallest Palindromic Permutation Greater Than Target
Day          : 332
Date         : 2026-08-28
*/

class Solution {
    fun lexPalindromicPermutation(s: String, target: String): String {
        val n = s.length
        val half = n / 2
        val freq = IntArray(26)
        for (ch in s) freq[ch - 'a']++

        val oddLetters = freq.count { it % 2 != 0 }
        if (oddLetters > 1 || (n % 2 == 0 && oddLetters == 1)) return ""

        var mid = ' '
        if (n % 2 == 1) {
            val oddIdx = freq.indexOfFirst { it % 2 != 0 }
            mid = 'a' + oddIdx
            freq[oddIdx]--
        }

        val pairs = IntArray(26) { freq[it] / 2 }

        fun smallestAvailable(): Int = (0..25).firstOrNull { pairs[it] > 0 } ?: -1

        fun buildTail(from: Int, arr: CharArray) {
            var k = from
            while (k < half) {
                val c = smallestAvailable()
                pairs[c]--
                arr[k] = 'a' + c
                arr[n - 1 - k] = 'a' + c
                k++
            }
        }

        val out = CharArray(n)
        if (mid != ' ') out[half] = mid

        val snapshotStack = ArrayDeque<IntArray>()
        var lastBump = -1

        var i = 0
        while (i < half) {
            snapshotStack.addLast(pairs.copyOf())
            val need = target[i] - 'a'
            var chosen = -1
            for (c in need..25) {
                if (pairs[c] > 0) { chosen = c; break }
            }
            if (chosen == -1) {
                if (lastBump == -1) return ""
                break
            }
            pairs[chosen]--
            out[i] = 'a' + chosen
            out[n - 1 - i] = 'a' + chosen
            if (chosen > need) {
                buildTail(i + 1, out)
                return out.concatToString()
            }
            if (((need + 1)..25).any { pairs[it] > 0 }) lastBump = i
            i++
        }

        if (i < half) {
            val restored = snapshotStack[lastBump]
            for (idx in 0..25) pairs[idx] = restored[idx]
            val need = target[lastBump] - 'a'
            val next = ((need + 1)..25).first { pairs[it] > 0 }
            pairs[next]--
            out[lastBump] = 'a' + next
            out[n - 1 - lastBump] = 'a' + next
            buildTail(lastBump + 1, out)
            return out.concatToString()
        }

        for (k in half until n) {
            if (out[k] > target[k]) return out.concatToString()
            if (out[k] < target[k]) {
                if (lastBump == -1) return ""
                val restored = snapshotStack[lastBump]
                for (idx in 0..25) pairs[idx] = restored[idx]
                val need = target[lastBump] - 'a'
                val next = ((need + 1)..25).first { pairs[it] > 0 }
                pairs[next]--
                out[lastBump] = 'a' + next
                out[n - 1 - lastBump] = 'a' + next
                buildTail(lastBump + 1, out)
                return out.concatToString()
            }
        }

        if (lastBump == -1) return ""
        val restored = snapshotStack[lastBump]
        for (idx in 0..25) pairs[idx] = restored[idx]
        val need = target[lastBump] - 'a'
        val next = ((need + 1)..25).first { pairs[it] > 0 }
        pairs[next]--
        out[lastBump] = 'a' + next
        out[n - 1 - lastBump] = 'a' + next
        buildTail(lastBump + 1, out)
        return out.concatToString()
    }
}