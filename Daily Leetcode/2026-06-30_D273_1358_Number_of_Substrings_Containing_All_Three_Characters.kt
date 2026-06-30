/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/solutions/8367261/kotlin-easy-by-pixelprince-j6mq
Problem      : 1358. Number of Substrings Containing All Three Characters
Day          : 273
Date         : 2026-06-30
*/

class Solution{
    fun numberOfSubstrings(s:String)=IntArray(3).run{
        s.indices.sumOf{set(s[it]-'a',it+1);minOrNull()!!}
    }
}