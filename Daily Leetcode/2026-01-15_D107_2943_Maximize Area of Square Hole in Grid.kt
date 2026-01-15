/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/maximize-area-of-square-hole-in-grid/solutions/7583308/maximize-area-of-square-hole-in-grid-eas-2bl3
Problem      : 2943. Maximize Area of Square Hole in Grid
Day          : 107
Date         : 2026-01-15
*/

class Solution{
 fun maximizeSquareHoleArea(n:Int,m:Int,h:IntArray,v:IntArray):Int{
  fun f(a:IntArray):Int{a.sort();var r=1;var i=0
   while(i<a.size){var c=1;while(i+1<a.size&&a[i]+1==a[i+1]){i++;c++};i++;r=maxOf(r,c)}
   return r}
  val k=minOf(f(h),f(v))+1
  return k*k
 }
}
