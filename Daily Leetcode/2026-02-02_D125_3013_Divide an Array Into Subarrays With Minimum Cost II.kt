/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-ii/solutions/7583436/divide-an-array-into-subarrays-with-mini-csat
Problem      : 3013. Divide an Array Into Subarrays With Minimum Cost II
Day          : 125
Date         : 2026-02-02
*/

class Solution {
    fun minimumCost(a: IntArray, k0: Int, d: Int): Long {
        val cmp = compareBy<Int>({ a[it] }, { it })
        val use = java.util.TreeSet(cmp)
        val ban = java.util.TreeSet(cmp)

        var k = k0 - 1
        var sum = 0L
        var ans = Long.MAX_VALUE

        for (i in 1..minOf(d + 1, a.lastIndex)) {
            sum += a[i]
            use.add(i)
        }
        while (use.size > k) {
            val x = use.pollLast()
            sum -= a[x]
            ban.add(x)
        }
        ans = sum

        var l = 1
        for (r in d + 2..a.lastIndex) {
            ban.add(r)
            if (use.remove(l)) {
                sum -= a[l]
                val x = ban.pollFirst()
                sum += a[x]
                use.add(x)
            } else {
                ban.remove(l)
                if (ban.isNotEmpty() && a[use.last()] > a[ban.first()]) {
                    val u = use.pollLast()
                    val b = ban.pollFirst()
                    sum += a[b] - a[u]
                    use.add(b)
                    ban.add(u)
                }
            }
            ans = minOf(ans, sum)
            l++
        }
        return a[0] + ans
    }
}