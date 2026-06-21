/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-ice-cream-bars/solutions/8348719/kotlin-easy-by-pixelprince-vlyc
Problem      : 1833. Maximum Ice Cream Bars
Day          : 264
Date         : 2026-06-21
*/

class Solution{
    fun maxIceCream(a:IntArray,c:Int):Int{
        a.sort()
        var s=0
        return a.takeWhile{s+=it;s<=c}.size
    }
}