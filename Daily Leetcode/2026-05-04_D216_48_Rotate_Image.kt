/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/rotate-image/solutions/8255867/kotlin-easy-by-pixelprince-qz23
Problem      : 48. Rotate Image
Day          : 216
Date         : 2026-05-04
*/

class Solution{
    fun rotate(a:Array<IntArray>){
        val n=a.size
        for(i in 0 until n)for(j in i+1 until n){val t=a[i][j];a[i][j]=a[j][i];a[j][i]=t}
        for(r in a)r.reverse()
    }
}