/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/avoid-flood-in-the-city/solutions/7576809/avoid-flood-in-the-city-by-pixelprince-suim/?envType=daily-question&envId=2025-10-07

Problem     : 1488. Avoid Flood in The City

Day         : 05
Date        : 2025-10-07
*/

class Solution {
    fun avoidFlood(rains: IntArray): IntArray {
        val hm = HashMap<Int, Int>()
        val tree = TreeSet<Int>()
        val ans = IntArray(rains.size)
        var i = 0
        while (i < rains.size) {
            val rain = rains[i]
            if (rain != 0) {
                if (hm.containsKey(rain)) {
                    val mapVal = hm[rain]!!
                    if (tree.ceiling(mapVal) != null) {
                        ans[tree.ceiling(mapVal)] = rain
                        hm[rain] = i
                        tree.remove(tree.ceiling(mapVal))
                    } else {
                        return IntArray(0)
                    }
                } else {
                    hm[rain] = i
                }
                ans[i] = -1
            } else {
                tree.add(i)
            }
            i += 1
        }
        for (tr in tree) {
            ans[tr] = 1
        }
        return ans
    }
}