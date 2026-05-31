/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/destroying-asteroids/solutions/8304134/kotlin-easy-by-pixelprince-23hz
Problem      : 2126. Destroying Asteroids
Day          : 243
Date         : 2026-05-31
*/

class Solution{
    fun asteroidsDestroyed(m:Int,a:IntArray):Boolean{
        var s=m.toLong()
        a.sort()
        for(x in a){
            if(s<x)return false
            s+=x
        }
        return true
    }
}