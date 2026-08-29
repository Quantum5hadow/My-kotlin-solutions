/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/solutions/8488702/kotlin-easy-by-pixelprince-57jt
Problem      : 2948. Make Lexicographically Smallest Array by Swapping Elements
Day          : 333
Date         : 2026-08-29
*/

class Solution{
    fun lexicographicallySmallestArray(a:IntArray,l:Int)=run{
        val s=a.sorted();val g=mutableListOf<ArrayDeque<Int>>();val m=HashMap<Int,Int>()
        for(x in s){
            if(g.isEmpty()||x-g.last().last()>l)g.add(ArrayDeque())
            g.last()+=x;m[x]=g.lastIndex
        }
        a.map{g[m[it]!!].removeFirst()}.toIntArray()
    }
}