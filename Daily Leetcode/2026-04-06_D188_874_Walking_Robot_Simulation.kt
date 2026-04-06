
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/walking-robot-simulation/solutions/7790542/kotlin-easy-by-pixelprince-m28u
Problem      : 874. Walking Robot Simulation
Day          : 188
Date         : 2026-04-06

class Solution{
    fun robotSim(c:IntArray,o:Array<IntArray>):Int{
        val set=o.map{it[0] to it[1]}.toHashSet()
        val dx=intArrayOf(0,1,0,-1);val dy=intArrayOf(1,0,-1,0)
        var x=0;var y=0;var d=0;var ans=0
        for(cmd in c){
            if(cmd==-1)d=(d+1)%4
            else if(cmd==-2)d=(d+3)%4
            else repeat(cmd){
                val nx=x+dx[d];val ny=y+dy[d]
                if(nx to ny in set)return@repeat
                x=nx;y=ny;ans=maxOf(ans,x*x+y*y)
            }
        }
        return ans
    }
}