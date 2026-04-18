/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/mirror-distance-of-an-integer/solutions/7972555/kotlin-easy-by-pixelprince-8qbn
Problem      : 3783. Mirror Distance of an Integer
Day          : 200
Date         : 2026-04-18
*/

class Solution{
    fun mirrorDistance(n:Int):Int{
        var x=n;var r=0
        while(x>0){r=r*10+x%10;x/=10}
        return kotlin.math.abs(n-r)
    }
}