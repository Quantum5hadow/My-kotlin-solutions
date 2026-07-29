/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-palindromic-rearrangement-ii/solutions/8428094/kotlin-easy-by-pixelprince-6tv6
Problem      : 3518. Smallest Palindromic Rearrangement II
Day          : 302
Date         : 2026-07-29
*/

class Solution {
    fun smallestPalindrome(s: String, k: Int): String {
        var K=k.toLong()
        val f=IntArray(26)
        for(c in s)f[c-'a']++
        if(f.count{it%2>0}>1)return ""
        val m=f.indexOfFirst{it%2>0}
        for(i in 0..25)f[i]/=2
        val lim=K+1

        fun c(n:Int,r:Int):Long{
            var a=1L
            for(i in 1..minOf(r,n-r)){
                a=minOf(lim,a*(n-i+1)/i)
            }
            return a
        }

        fun ways():Long{
            var n=f.sum()
            var r=1L
            for(v in f){
                r=minOf(lim,r*c(n,v))
                n-=v
            }
            return r
        }

        if(K>ways())return ""
        val h=StringBuilder()
        repeat(s.length/2){
            for(i in 0..25){
                if(f[i]==0)continue
                f[i]--
                val w=ways()
                if(w>=K){
                    h.append('a'+i)
                    break
                }
                f[i]++
                K-=w
            }
        }
        return buildString{
            append(h)
            if(m>=0)append('a'+m)
            append(h.reverse())
        }
    }
}