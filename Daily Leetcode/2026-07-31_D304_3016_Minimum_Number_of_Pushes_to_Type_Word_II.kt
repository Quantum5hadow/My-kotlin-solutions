/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/solutions/8431761/kotlin-easy-by-pixelprince-yblj
Problem      : 3016. Minimum Number of Pushes to Type Word II
Day          : 304
Date         : 2026-07-31
*/

class Solution{
    fun minimumPushes(w:String):Int{
        val f=IntArray(26)
        for(c in w)f[c-'a']++
        f.sort()
        return f.reversed().mapIndexed{i,v->v*(i/8+1)}.sum()
    }
}
