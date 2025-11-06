/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/power-grid-maintenance/solutions/7578649/easy-by-pixelprince-70em
Problem     : 3607. Find X-Sum of All K-Long Subarrays II




Day         : 37
Date        : 2025-11-6
*/


class Solution {
    private class UF(n: Int) {
        val par: IntArray = IntArray(n)
        val pq: Array<PriorityQueue<Int>> = Array(n) { PriorityQueue() }
        val active: BooleanArray = BooleanArray(n)

        init {
            for (i in 0 until n) {
                active[i] = true
                par[i] = i
                pq[i].add(i)
            }
        }

        fun find(u: Int): Int {
            if (par[u] == u) {
                return u
            }
            par[u] = find(par[u])
            return par[u]
        }

        fun union(u: Int, v: Int) {
            val pu = find(u)
            val pv = find(v)
            if (pu == pv) {
                return
            }
            if (pq[pu].size > pq[pv].size) {
                while (pq[pv].isNotEmpty()) {
                    pq[pu].add(pq[pv].poll())
                }
                par[pv] = pu 
            } else {
                while (pq[pu].isNotEmpty()) {
                    pq[pv].add(pq[pu].poll())
                }
                par[pu] = pv 
            }
        }

        fun inactive(u: Int) {
            active[u] = false
        }

        fun check(u: Int): Int {
            if (active[u]) {
                return u
            }
            val pu = find(u)
            while (pq[pu].isNotEmpty() && !active[pq[pu].peek()]) {
                pq[pu].poll()
            }
            return if (pq[pu].isNotEmpty()) pq[pu].peek() else -2
        }
    }

    fun processQueries(c: Int, connections: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val uf = UF(c)
        for (con in connections) {
            val u = con[0]
            val v = con[1]
            uf.union(u - 1, v - 1)
        }
        val res = mutableListOf<Int>()
        for (q in queries) {
            if (q[0] == 1) {
                res.add(uf.check(q[1] - 1) + 1)
            } else {
                uf.inactive(q[1] - 1)
            }
        }
        return res.toIntArray()
    }
}