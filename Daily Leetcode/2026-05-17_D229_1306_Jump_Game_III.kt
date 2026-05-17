/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/jump-game-iii/solutions/8255860/kotlin-easy-by-pixelprince-jco2
Problem      : 1306. Jump Game III
Day          : 229
Date         : 2026-05-17
*/

class Solution{
    fun canReach(a:IntArray,s:Int):Boolean{
        if(s !in a.indices||a[s]<0)return false
        if(a[s]==0)return true
        val x=a[s];a[s]=-1
        return canReach(a,s-x)||canReach(a,s+x)
    }
}