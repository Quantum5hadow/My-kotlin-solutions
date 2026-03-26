/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/equal-sum-grid-partition-ii/submissions/1959759695
Problem      : 3548. Equal Sum Grid Partition II
Day          : 177
Date         : 2026-03-26
*/


class Solution{
    fun canPartitionGrid(g:Array<IntArray>):Boolean{
        val n=g.size;val m=g[0].size
        val map=HashMap<Int,MutableList<IntArray>>()
        val pr=LongArray(n);val pc=LongArray(m)
        for(i in 0 until n){
            var s=0L
            for(j in 0 until m){
                val v=g[i][j];s+=v
                map.computeIfAbsent(v){mutableListOf()}.add(intArrayOf(i,j))
            }
            pr[i]=s+(if(i>0)pr[i-1]else 0)
        }
        for(j in 0 until m){
            var s=0L
            for(i in 0 until n)s+=g[i][j]
            pc[j]=s+(if(j>0)pc[j-1]else 0)
        }
        val tot=pr[n-1]
        fun ok(r1:Int,c1:Int,r2:Int,c2:Int,i:Int,j:Int):Boolean{
            val h=r2-r1+1;val w=c2-c1+1
            if(h*w<=1)return false
            if(h==1)return j==c1||j==c2
            if(w==1)return i==r1||i==r2
            return true
        }
        for(i in 0 until n-1){
            val a=pr[i];val b=tot-a
            if(a==b)return true
            val d=kotlin.math.abs(a-b)
            if(d>Int.MAX_VALUE)continue
            map[d.toInt()]?.forEach{
                val x=it[0];val y=it[1]
                if(a>b&&x<=i&&ok(0,0,i,m-1,x,y))return true
                if(a<b&&x>i&&ok(i+1,0,n-1,m-1,x,y))return true
            }
        }
        for(j in 0 until m-1){
            val a=pc[j];val b=tot-a
            if(a==b)return true
            val d=kotlin.math.abs(a-b)
            if(d>Int.MAX_VALUE)continue
            map[d.toInt()]?.forEach{
                val x=it[0];val y=it[1]
                if(a>b&&y<=j&&ok(0,0,n-1,j,x,y))return true
                if(a<b&&y>j&&ok(0,j+1,n-1,m-1,x,y))return true
            }
        }
        return false
    }
}