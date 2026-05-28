/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-common-suffix-queries/solutions/8298301/kotlin-easy-by-pixelprince-986v
Problem      : 3093. Longest Common Suffix Queries
Day          : 240
Date         : 2026-05-28
*/

class Solution{
    class T{
        val c=HashMap<Char,T>()
        var i=0;var l=1e9.toInt()
    }
    fun stringIndices(a:Array<String>,q:Array<String>):IntArray{
        val r=T()
        for(i in a.indices){
            var t=r;val s=a[i]
            if(s.length<t.l){t.l=s.length;t.i=i}
            for(x in s.reversed()){
                t=t.c.getOrPut(x){T()}
                if(s.length<t.l){t.l=s.length;t.i=i}
            }
        }
        return IntArray(q.size){
            var t=r
            for(x in q[it].reversed())t=t.c[x]?:break
            t.i
        }
    }
}