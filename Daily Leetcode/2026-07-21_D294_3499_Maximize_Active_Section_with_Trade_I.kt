/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximize-active-section-with-trade-i/solutions/8410173/kotlin-easy-by-pixelprince-d0b1
Problem      : 3499. Maximize Active Section with Trade I
Day          : 294
Date         : 2026-07-21
*/

class Solution{
    fun maxActiveSectionsAfterTrade(s:String):Int{
        var o=0
        val z=mutableListOf(0)
        val a=mutableListOf<Int>()
        var i=0
        while(i<s.length){
            var c=0
            val x=s[i]
            while(i<s.length&&s[i]==x){i++;c++}
            if(x=='1'){o+=c;a+=c}else z+=c
        }
        var b=0
        for(i in 1 until z.lastIndex)if(a[i-1]>0)b=maxOf(b,z[i]+z[i+1])
        return o+b
    }
}