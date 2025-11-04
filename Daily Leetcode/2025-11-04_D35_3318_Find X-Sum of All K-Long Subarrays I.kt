/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/solutions/7578630/easy-by-pixelprince-ezgf

Problem     : 3318. Find X-Sum of All K-Long Subarrays I




Day         : 35
Date        : 2025-11-4
*/


class Solution {
    private class Pair(num: Int, freq: Int) {
        var num: Int
        var freq: Int

        init {
            this.num = num
            this.freq = freq
        }
    }

    fun findXSum(nums: IntArray, k: Int, x: Int): IntArray {
        val n = nums.size
        val ans = IntArray(n - k + 1)
        for (i in 0 until n - k + 1) {
            val map = HashMap<Int, Int>()
            val pq =
                PriorityQueue<Pair>(
                    Comparator { a: Pair, b: Pair ->
                        if (a.freq == b.freq) {
                            return@Comparator b.num - a.num
                        }
                        b.freq - a.freq
                    },
                )
            for (j in i until i + k) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1)
            }
            for (entry in map.entries) {
                pq.add(Pair(entry.key, entry.value))
            }
            var count = x
            var sum = 0
            while (pq.isNotEmpty() && count > 0) {
                val pair = pq.remove()
                sum += pair.num * pair.freq
                count--
            }
            ans[i] = sum
        }
        return ans
    }
}