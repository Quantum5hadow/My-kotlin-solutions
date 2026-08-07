/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-divisible-digit-product-ii/solutions/8446823/kotlin-easy-by-pixelprince-mlqx
Problem      : 3348. Smallest Divisible Digit Product II
Day          : 311
Date         : 2026-08-07
*/

class Solution {
    fun smallestNumber(s: String, t: Long): String {
        val n = s.length
        fun g(a: Long, b: Long): Long = if (b == 0L) a else g(b, a % b)
        val z = s.indexOf('0')
        val pl = if (z == -1) n else z
        val p = LongArray(pl + 1) { t }
        for (i in 0 until pl) p[i + 1] = p[i] / g((s[i] - '0').toLong(), p[i])
        if (z == -1 && p[n] == 1L) return s

        fun minDigits(r0: Long): Int {
            var r = r0
            var count = 0
            for (d in 9 downTo 2) while (r % d == 0L) { r /= d; count++ }
            return if (r != 1L) -1 else count
        }

        fun f(r0: Long, len: Int): String? {
            var r = r0
            val b = StringBuilder()
            for (d in 9 downTo 2) while (r % d == 0L) { r /= d; b.insert(0, d) }
            return if (r != 1L || b.length > len) null else "1".repeat(len - b.length) + b
        }

        val last = if (z == -1) n - 1 else z
        for (i in last downTo 0) for (d in s[i] - '0' + 1..9) {
            val e = f(p[i] / g(p[i], d.toLong()), n - i - 1) ?: continue
            return s.take(i) + d + e
        }

        val need = minDigits(t)
        if (need == -1) return "-1"
        val len = maxOf(n + 1, need)
        return f(t, len) ?: "-1"
    }
}