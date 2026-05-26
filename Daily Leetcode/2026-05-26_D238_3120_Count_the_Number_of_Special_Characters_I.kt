/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/count-the-number-of-special-characters-i/solutions/8294776/kotlin-easy-by-pixelprince-1v8m
Problem      : 3120. Count the Number of Special Characters I
Day          : 238
Date         : 2026-05-26
*/

class Solution{
    fun numberOfSpecialChars(s:String)=
        ('a'..'z').count{it in s&&it.uppercaseChar() in s}
}