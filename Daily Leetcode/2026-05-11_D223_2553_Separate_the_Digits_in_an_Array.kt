/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/separate-the-digits-in-an-array/solutions/8255970/kotlin-easy-by-pixelprince-7jzj
Problem      : 2553. Separate the Digits in an Array
Day          : 223
Date         : 2026-05-11
*/

class Solution{
    fun separateDigits(a:IntArray)=
        a.flatMap{it.toString().map{c->c-'0'}}.toIntArray()
}