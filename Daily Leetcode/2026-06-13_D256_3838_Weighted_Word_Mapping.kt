/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/weighted-word-mapping/solutions/8346746/kotlin-easy-by-pixelprince-k1gq
Problem      : 3838. Weighted Word Mapping
Day          : 256
Date         : 2026-06-13
*/

class Solution{
    fun mapWordWeights(w:Array<String>,a:IntArray)=
        w.joinToString(""){('z'-it.sumOf{c->a[c-'a']}%26).toString()}
}