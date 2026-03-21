/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/solutions/7680296/kotlin-easy-by-pixelprince-g59f
Problem      : 1886. Determine Whether Matrix Can Be Obtained By Rotation
Day          : 172
Date         : 2026-03-21
*/

class Solution{
    fun findRotation(a:Array<IntArray>,b:Array<IntArray>):Boolean{
        val n=a.size;var p1=true;var p2=true;var p3=true;var p4=true
        for(i in 0 until n)for(j in 0 until n){
            val v=a[i][j]
            if(v!=b[i][j])p1=false
            if(v!=b[j][n-1-i])p2=false
            if(v!=b[n-1-i][n-1-j])p3=false
            if(v!=b[n-1-j][i])p4=false
        }
        return p1||p2||p3||p4
    }
}
