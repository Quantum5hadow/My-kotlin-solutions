/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/block-placement-queries/solutions/8302485/kotlin-easy-by-pixelprince-hlfn
Problem      : 3161. Block Placement Queries
Day          : 242
Date         : 2026-05-30
*/

class Solution{
    fun getResults(q:Array<IntArray>)=sortedSetOf(0,100000).run{
        val m=java.util.TreeMap<Int,java.util.TreeSet<Int>>()
        m[-100000]=sortedSetOf(0)
        q.mapNotNull{
            val x=it[1]
            if(it[0]==1){
                val l=lower(x);val r=higher(x);add(x)
                m[l-r]?.apply{remove(l);if(isEmpty())m.remove(l-r)}
                m.getOrPut(l-x){java.util.TreeSet()}.add(l)
                m.getOrPut(x-r){java.util.TreeSet()}.add(x)
                null
            }else m.any{(g,s)->-g>=it[2]&&s.first()<=x-it[2]}
        }
    }
}