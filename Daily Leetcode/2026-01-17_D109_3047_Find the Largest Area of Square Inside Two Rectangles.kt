
/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-largest-area-of-square-inside-two-rectangles/solutions/7583329/find-the-largest-area-of-square-inside-t-t3gt
Problem      : 3047. Find the Largest Area of Square Inside Two Rectangles
Day          : 109
Date         : 2026-01-17
*/

class Solution{
 fun largestSquareArea(a:Array<IntArray>,b:Array<IntArray>):Long{
  var r=0L
  for(i in a.indices)for(j in i+1 until a.size){
   val s=minOf(minOf(b[i][0],b[j][0])-maxOf(a[i][0],a[j][0]),
               minOf(b[i][1],b[j][1])-maxOf(a[i][1],a[j][1]))
   if(s>0) r=maxOf(r,1L*s*s)
  }
  return r
 }
}
