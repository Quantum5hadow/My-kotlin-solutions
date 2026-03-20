/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-absolute-difference-in-sliding-submatrix/solutions/7674584/kotlin-easy-by-pixelprince-5r6i
Problem      : 3567. Minimum Absolute Difference in Sliding Submatrix
Day          : 171
Date         : 2026-03-20
*/


class Solution{
    fun minAbsDiff(g:Array<IntArray>,k:Int)=Array(g.size-k+1){i->
        IntArray(g[0].size-k+1){j->
            val s=java.util.TreeSet<Int>()
            for(r in i until i+k)for(c in j until j+k)s+=g[r][c]
            var p:Int?=null;var ans=Int.MAX_VALUE
            for(v in s){if(p!=null)ans=minOf(ans,v-p!!);p=v}
            if(ans==Int.MAX_VALUE)0 else ans
        }
    }
}