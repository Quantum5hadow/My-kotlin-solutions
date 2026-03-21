/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/flip-square-submatrix-vertically/solutions/7677284/kotlin-easy-by-pixelprince-xfrl
Problem      : 3643. Flip Square Submatrix Vertically
Day          : 172
Date         : 2026-03-21
*/

class Solution{
    fun reverseSubmatrix(g:Array<IntArray>,x:Int,y:Int,k:Int)=g.apply{
        for(i in 0 until k/2)
            this[x+i].copyOfRange(y,y+k).also{
                System.arraycopy(this[x+k-1-i],y,this[x+i],y,k)
                System.arraycopy(it,0,this[x+k-1-i],y,k)
            }
    }
}