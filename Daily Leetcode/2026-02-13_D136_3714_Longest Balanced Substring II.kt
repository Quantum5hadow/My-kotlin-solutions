/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/longest-balanced-substring-ii/solutions/7576141/easy-by-pixelprince-3z6g
Problem      : 3714. Longest Balanced Substring II
Day          : 136
Date         : 2026-02-13
*/

class Solution {
    fun longestBalanced(s: String): Int {
        var m = Array(4){mutableMapOf(0 to -1)}; var f = 0
        var c = IntArray(3); var k = IntArray(3)
        return s.indices.maxOf { i ->
            c[s[i]-'a']++; if (i>0 && s[i]==s[i-1]) f++ else f=1; var r=f
            for (e in 0..2) if (s[i]-'a'==e){ m[e]=hashMapOf(0 to i); k[e]=0 }
            else{
                if ((s[i]-'a'+1)%3==e) k[e]++ else k[e]--
                r=maxOf(r,i-(m[e].getOrPut(k[e]){i}))
            }
            maxOf(r,i-(m[3].getOrPut(((c[1]-c[0]) shl 16)+(c[2]-c[0])){i}))
        }
    }
}

