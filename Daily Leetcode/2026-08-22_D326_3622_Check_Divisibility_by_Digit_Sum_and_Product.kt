/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/solutions/8483748/kotlin-easy-by-pixelprince-tqk3
Problem      : 3622. Check Divisibility by Digit Sum and Product
Day          : 326
Date         : 2026-08-22
*/

class Solution{
    fun checkDivisibility(n:Int)=n%(n.toString().fold(0 to 1){(s,p),c->s+(c-'0') to p*(c-'0')}.let{it.first+it.second})==0
}