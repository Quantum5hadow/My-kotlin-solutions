/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/find-the-safest-path-in-a-grid/solutions/8369367/kotlin-easy-by-pixelprince-ayyn
Problem      : 2812. Find the Safest Path in a Grid
Day          : 274
Date         : 2026-07-01
*/

class Solution{
    fun maximumSafenessFactor(g:List<List<Int>>):Int{
        val n=g.size;val d=Array(n){IntArray(n){-1}}
        val q=PriorityQueue<IntArray>{a,b->b[0]-a[0]};var t=0
        for(i in 0 until n)for(j in 0 until n)if(g[i][j]>0)q+=intArrayOf(0,j,i)
        while(t<2){
            if(q.isEmpty()){t++;q+=intArrayOf(d[0][0],0,0);d[0][0]=-1;continue}
            val(s,x,y)=q.poll()
            if(t==0){
                if(d[y][x]<0){
                    d[y][x]=-s
                    for((dx,dy) in arrayOf(1 to 0,-1 to 0,0 to 1,0 to -1))
                        if(x+dx in 0 until n&&y+dy in 0 until n)
                            q+=intArrayOf(s-1,x+dx,y+dy)
                }
            }else{
                if(x==n-1&&y==n-1)return s
                for((dx,dy) in arrayOf(1 to 0,-1 to 0,0 to 1,0 to -1))
                    if(x+dx in 0 until n&&y+dy in 0 until n&&d[y+dy][x+dx]>=0){
                        q+=intArrayOf(minOf(s,d[y+dy][x+dx]),x+dx,y+dy)
                        d[y+dy][x+dx]=-1
                    }
            }
        }
        return 0
    }
}