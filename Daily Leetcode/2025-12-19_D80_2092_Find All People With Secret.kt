/*
LeetCode ID : PixelPrince
Profile     : https://leetcode.com/u/PixelPrince/
Submission  : https://leetcode.com/problems/find-all-people-with-secret/solutions/7581719/find-all-people-with-secret-easy-by-pixe-7wki
Problem     : 2092. Find All People With Secret
Day         : 80
Date        : 2025-12-19

*/

class Solution {
    fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> {
        meetings.sortWith { a: IntArray, b: IntArray -> a[2] - b[2] }
        val uf = UF(n)
        
        uf.union(0, firstPerson)
    
        var i = 0
        while (i < meetings.size) {
            val curTime = meetings[i][2]
            val pool: MutableSet<Int> = HashSet()
            while (i < meetings.size && curTime == meetings[i][2]) {
                val currentMeeting = meetings[i]
                uf.union(currentMeeting[0], currentMeeting[1])
                pool.add(currentMeeting[0])
                pool.add(currentMeeting[1])
                i++
            }
            
            for (j in pool) {
                if (!uf.connected(0, j)) {
                    uf.reset(j)
                }
            }
        }
       
        val ans: MutableList<Int> = ArrayList()
        for (j in 0 until n) {
            if (uf.connected(j, 0)) {
                ans.add(j)
            }
        }
        return ans
    }

   
    private class UF(n: Int) {
        private val parent: IntArray
        private val rank: IntArray

        init {
            parent = IntArray(n)
            rank = IntArray(n)
            for (i in 0 until n) {
                parent[i] = i
            }
        }

        fun union(p: Int, q: Int) {
            val rootP = find(p)
            val rootQ = find(q)
            if (rootP == rootQ) {
                return
            }
            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ
            } else {
                parent[rootQ] = rootP
                rank[rootP]++
            }
        }

        fun find(p: Int): Int {
            var p = p
            while (parent[p] != p) {
                p = parent[parent[p]]
            }
            return p
        }

        fun connected(p: Int, q: Int): Boolean {
            return find(p) == find(q)
        }

        fun reset(p: Int) {
            parent[p] = p
            rank[p] = 0
        }
    }
}