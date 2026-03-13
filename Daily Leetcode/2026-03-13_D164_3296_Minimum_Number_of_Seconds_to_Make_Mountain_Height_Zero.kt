/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-number-of-seconds-to-make-mountain-height-zero/solutions/7658067/kotlin-easy-by-pixelprince-ppvz
Problem      : 3296. Minimum Number of Seconds to Make Mountain Height Zero
Day          : 164
Date         : 2026-03-13
*/

class Solution{
    fun minNumberOfSeconds(h:Int,w:IntArray):Long{
        var l=0L;var r=1L*h*(h+1)/2*w[0]
        fun ok(t:Long):Boolean{
            var s=0L
            for(x in w){s+=(kotlin.math.sqrt(2.0*t/x+0.25)-0.5).toLong();if(s>=h)return true}
            return false
        }
        while(l<r){val m=(l+r)/2;if(ok(m))r=m else l=m+1}
        return l
    }
}