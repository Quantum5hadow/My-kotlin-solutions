/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/solutions/8483745/kotlin-easy-by-pixelprince-gbfg
Problem      : 2904. Shortest and Lexicographically Smallest Beautiful String
Day          : 330
Date         : 2026-08-26
*/

class Solution{
    fun shortestBeautifulSubstring(s:String,k:Int)=run{
        var r=""
        for(l in k..s.length){
            s.windowed(l).filter{it.count{c->c=='1'}==k}.minOrNull()?.let{r=it}
            if(r!="")break
        }
        r
    }
}