/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximum-building-height/solutions/8346734/kotlin-easy-by-pixelprince-k4w9
Problem      : 1840. Maximum Building Height
Day          : 263
Date         : 2026-06-20
*/

class Solution{
    fun maxBuilding(n:Int,r:Array<IntArray>):Int{
        val a=(r+arrayOf(intArrayOf(1,0),intArrayOf(n,n-1))).sortedBy{it[0]}
        for(i in 1..<a.size)a[i][1]=minOf(a[i][1],a[i-1][1]+a[i][0]-a[i-1][0])
        for(i in a.lastIndex-1 downTo 0)a[i][1]=minOf(a[i][1],a[i+1][1]+a[i+1][0]-a[i][0])
        var ans=0
        for(i in 1..<a.size){
            val d=a[i][0]-a[i-1][0]
            ans=maxOf(ans,maxOf(a[i][1],a[i-1][1])+(d-kotlin.math.abs(a[i][1]-a[i-1][1]))/2)
        }
        return ans
    }
}