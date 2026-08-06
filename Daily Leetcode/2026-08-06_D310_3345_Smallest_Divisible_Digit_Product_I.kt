/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/smallest-divisible-digit-product-i/solutions/8444164/kotlin-easy-by-pixelprince-htkm
Problem      : 3345. Smallest Divisible Digit Product I
Day          : 310
Date         : 2026-08-06
*/

class Solution{
    fun smallestNumber(n:Int,t:Int)=
        (n..Int.MAX_VALUE).first{
            it.toString().fold(1){a,c->a*(c-'0')}%t==0
        }
}