/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/distribute-elements-into-two-arrays-i/solutions/8471877/kotlin-easy-by-pixelprince-irop
Problem      : 3069. Distribute Elements Into Two Arrays I
Day          : 324
Date         : 2026-08-20
*/

class Solution{
    fun resultArray(a:IntArray)=run{
        val x=mutableListOf(a[0]);val y=mutableListOf(a[1])
        a.drop(2).forEach{(if(x.last()>y.last())x else y)+=it}
        x+y
    }
}