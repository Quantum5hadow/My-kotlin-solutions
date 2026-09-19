/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/circle-and-rectangle-overlapping/solutions/8528662/kotlin-easy-by-pixelprince-jqiu
Problem      : 1401. Circle and Rectangle Overlapping
Day          : 354
Date         : 2026-09-19
*/

class Solution{
    fun checkOverlap(r:Int,x:Int,y:Int,x1:Int,y1:Int,x2:Int,y2:Int):Boolean{
        val a=x.coerceIn(x1,x2);val b=y.coerceIn(y1,y2)
        return (x-a)*(x-a)+(y-b)*(y-b)<=r*r
    }
}
