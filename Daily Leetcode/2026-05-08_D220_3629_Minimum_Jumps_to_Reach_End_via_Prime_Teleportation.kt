/*
LeetCode ID  : PixelPrince
Profile      : https://leetcode.com/u/PixelPrince/
Submission   : https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-teleportation/solutions/8255947/kotlin-easy-by-pixelprince-vjrz
Problem      : 3629. Minimum Jumps to Reach End via Prime Teleportation
Day          : 220
Date         : 2026-05-08
*/

class Solution{
    fun minJumps(a:IntArray):Int{
        val n=a.size
        val mp=HashMap<Int,MutableList<Int>>()
        for(i in 0 until n){
            var x=a[i];var d=2
            while(d*d<=x){
                if(x%d==0){mp.getOrPut(d){ArrayList()}.add(i);while(x%d==0)x/=d}
                d++
            }
            if(x>1)mp.getOrPut(x){ArrayList()}.add(i)
        }
        val q=ArrayDeque<Int>();val v=BooleanArray(n);val u=HashSet<Int>()
        q.add(0);v[0]=true;var s=0
        while(q.isNotEmpty()){
            repeat(q.size){
                val i=q.removeFirst()
                if(i==n-1)return s
                if(i>0&&!v[i-1]){v[i-1]=true;q.add(i-1)}
                if(i+1<n&&!v[i+1]){v[i+1]=true;q.add(i+1)}
                val p=a[i]
                if(p>1&&u.add(p))
                    for(j in mp[p]?:emptyList())
                        if(!v[j]){v[j]=true;q.add(j)}
            }
            s++
        }
        return -1
    }
}