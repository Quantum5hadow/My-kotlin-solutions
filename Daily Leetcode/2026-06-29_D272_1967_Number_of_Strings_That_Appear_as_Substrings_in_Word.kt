/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/solutions/8364392/kotlin-easy-by-pixelprince-0vd6
Problem      : 1967. Number of Strings That Appear as Substrings in Word
Day          : 272
Date         : 2026-06-29
*/

class Solution{
    fun numOfStrings(p:Array<String>,w:String)=
        p.count(w::contains)
}