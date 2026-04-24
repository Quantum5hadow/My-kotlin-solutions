
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/furthest-point-from-origin/solutions/8091116/kotlin-easy-by-pixelprince-sip5
Problem      : 2833. Furthest Point From Origin
Day          : 206
Date         : 2026-04-24


class Solution{
    fun furthestDistanceFromOrigin(s:String):Int{
        var l=0;var r=0;var u=0
        for(c in s){
            if(c=='L')l++
            else if(c=='R')r++
            else u++
        }
        return kotlin.math.abs(l-r)+u
    }
}