/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/get-biggest-three-rhombus-sums-in-a-grid/solutions/7652069/kotlin-easy-by-pixelprince-lb4d
Problem      : 1878. Get Biggest Three Rhombus Sums in a Grid
Day          : 167
Date         : 2026-03-16
*/

class Solution{
    fun getBiggestThree(g:Array<IntArray>):List<Int>{
        val s=hashSetOf<Int>()
        for(y in g.indices)for(x in g[0].indices){
            s+=g[y][x]
            for(d in 1..minOf(x,g[0].size-1-x,y,g.size-1-y)){
                var c=0;var i=y-d;var j=x
                for((dy,dx) in arrayOf(1 to 1,1 to -1,-1 to -1,-1 to 1))
                    repeat(d){c+=g[i][j];i+=dy;j+=dx}
                s+=c
            }
        }
        return s.sortedDescending().take(3)
    }
}
