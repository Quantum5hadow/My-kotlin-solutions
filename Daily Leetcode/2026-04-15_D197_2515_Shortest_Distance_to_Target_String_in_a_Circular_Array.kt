/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/solutions/7921268/kotlin-easy-by-pixelprince-jcnr
Problem      : 2515. Shortest Distance to Target String in a Circular Array
Day          : 197
Date         : 2026-04-15
*/

class Solution{
    fun closestTarget(w:Array<String>,t:String,s:Int):Int{
        val n=w.size
        for(i in 0..n/2)
            if(w[(s+i)%n]==t||w[(s-i+n)%n]==t)return i
        return -1
    }
}