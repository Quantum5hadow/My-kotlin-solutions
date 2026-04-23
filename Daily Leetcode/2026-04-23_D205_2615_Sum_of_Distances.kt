/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/sum-of-distances/solutions/8070195/kotlin-easy-by-pixelprince-71s0
Problem      : 2615. Sum of Distances
Day          : 205
Date         : 2026-04-23
*/

class Solution{
    fun distance(a:IntArray):LongArray{
        val n=a.size;val r=LongArray(n);val m=HashMap<Int,LongArray>()
        for(i in 0 until n){
            val p=m.getOrPut(a[i]){longArrayOf(0,0)}
            r[i]+=i*p[1]-p[0];p[0]+=i;p[1]++
            val j=n-1-i;val q=m.getOrPut(-a[j]-1){longArrayOf(0,0)}
            r[j]+=q[0]-j*q[1];q[0]+=j;q[1]++
        }
        return r
    }
}